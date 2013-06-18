/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.rf;

import com.sun.security.ntlm.Client;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import models.Cliente;
import models.Quarto;
/**
 *
 * @author Adriano
 */
@ManagedBean
@RequestScoped
public class Reservar {
    private Cliente cliente;
    private models.Quarto quarto;
    private Date date;

    public Reservar() {
        cliente = new Cliente();
        quarto = new models.Quarto();
        date = new Date();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public String agendar(){
        return "";
    }
    
    public String novo(){
        return "agendamento.novo";
    }
}
