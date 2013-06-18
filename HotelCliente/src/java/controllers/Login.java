/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.web.ServidorHotel;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import models.Cliente;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Adriano
 */
@ManagedBean
@SessionScoped
public class Login implements Serializable {

    private Cliente cliente;
    private boolean login;

    public Login() {
        cliente = new Cliente();
        login = false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public String logIn() {
        FacesContext context = FacesContext.getCurrentInstance();
        boolean validate = true;
        Cliente c = ServidorHotel.getInstance().getHotel().login(cliente);
        cliente = new Cliente();
        if (c == null) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário Inválido", ""));
        }else{
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, c.getNome()+" - Seja bem vindo", ""));
            login = true;
            setCliente(c);
            return "quarto.listar";
        }
        return "";
    }

    public String logOff() {
        cliente = new Cliente();
        login = false;
        return "";
    }
}
