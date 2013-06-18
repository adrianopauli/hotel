package controllers.rf;

import controllers.web.ServidorHotel;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import models.Cliente;
import models.Reserva;

/**
 *
 * @author Adriano
 */
@ManagedBean
@RequestScoped
public class MyReservas {

    private Cliente cliente;
    
    public MyReservas() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }   
    
    public List<Reserva> getRevercas(){
        return ServidorHotel.getInstance().getHotel().minhasReservas(cliente);
    }
}
