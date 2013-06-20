/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.rf;

import controllers.web.ServidorHotel;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import models.Cliente;
import models.Quarto;
import models.Reserva;

/**
 *
 * @author Adriano
 */
@ManagedBean
@SessionScoped
public class Reservar {

    private Reserva reserva;
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

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public String agendar() {
        if (quarto != null) {
            boolean c = ServidorHotel.getInstance().getHotel().cadastrarReserva(cliente, date.getTime(), quarto);
            if (c) {
                quarto = new models.Quarto();
                date = new Date();
                reserva = new Reserva();
                return "myreservas";
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Reserva negada!", "A data está indesponível"));
            }
        }
        return "";
    }

    public void cancelar(ActionEvent actionEvent) {
        FacesMessage message;

        boolean c = ServidorHotel.getInstance().getHotel().cancelar(reserva);
        if (c) {
            cliente = new Cliente();
            quarto = new models.Quarto();
            date = new Date();
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Agendamento removido", "");
        } else {
            message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "");
        }

        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public String novo() {
        return "agendamento.novo";
    }
}