/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.web.ServidorHotel;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import models.Cliente;

/**
 *
 * @author Adriano
 */
@ManagedBean
@RequestScoped
public class Usuario {

    private Cliente cliente;
    private String senha;

    public Usuario() {
        cliente = new Cliente();
        senha = "";
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String submit() {
        FacesContext context = FacesContext.getCurrentInstance();
        boolean validate = true;
        if (cliente.getNome() == null | cliente.getNome().length() < 5) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Nome Inválido", ""));
            validate = false;
        }
        if (cliente.getLogin()== null | cliente.getLogin().length() < 5) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login Inválido", ""));
            validate = false;
        }
        if (cliente.getFone() == null | cliente.getFone().length() < 5) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Fone Inválido", ""));
            validate = false;
        }

        if (cliente.getSenha() == null) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Senha Inválida", ""));
            validate = false;

        } else if (!senha.equals(cliente.getSenha())) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Senhas não correspondem", ""));
            validate = false;
        }

        if (validate) {
            try {
                ServidorHotel.getInstance().getHotel().cadastroCliente(cliente);
                return "home.inicio";
            } catch (Exception e) {
            }
        }
        return "";
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
