/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import models.Cliente;
import models.Quarto;
import models.Reserva;
import rep.RepClientes;
import rep.RepQuartos;
import rep.RepReservas;

/**
 *
 * @author Adriano
 */
@WebService(serviceName = "HotelSeQueSabe")
public class HotelSeQueSabe {

     /**
     * Operação de Web service
     */
    @WebMethod(operationName = "cadastroCliente")
    @Oneway
    public void cadastroCliente(@WebParam(name = "cliente") Cliente cliente) {
        RepClientes.getInstance().adicionaCliente(cliente);
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "consultaQuartosDisponiveis")
    public List<Quarto> consultaQuartosDisponiveis(@WebParam(name = "data") long data) {
        List<Quarto> quartosDisponiveis = RepQuartos.getInstance().getQuartos();
        Date d = new Date(data);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String format = sdf.format(d);
        for (Reserva reserva : RepReservas.getInstance().getReservas()) {
            String dataReserva = sdf.format(reserva.getData());            
            if(dataReserva.equals(format)){
                Quarto q = reserva.getQuarto();
                quartosDisponiveis.remove(q);
            } 
        }     
        for (Quarto quarto : quartosDisponiveis) {
            System.out.println(quarto.getDescricao());
        }
        return quartosDisponiveis;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "minhasReservas")
    public List<Reserva> minhasReservas(@WebParam(name = "cliente") Cliente cliente) {
        List<Reserva> reservas = new ArrayList<Reserva>();
        
        for (Reserva reserva : RepReservas.getInstance().getReservas()) {
            if(reserva.getCliente().getNome().equals(cliente.getNome())){
                reservas.add(reserva);
            }
        }
        return reservas;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "cadastrarReserva")
    public Boolean cadastrarReserva(@WebParam(name = "cliente") Cliente cliente, @WebParam(name = "data") Long data, @WebParam(name = "quarto") Quarto quarto) {
        Reserva r = new Reserva();
        r.setCliente(cliente);
        Date d = new Date(data);
        r.setData(d);
        r.setQuarto(quarto);
        try {
            RepReservas.getInstance().adicionarReserva(r);
            System.out.println("RESERVA REALIZADA!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**Realizar a autenticação de um cliente*/
    @WebMethod(operationName = "login")
    public Cliente login(@WebParam(name = "cliente") Cliente c) {
        List<Cliente> clientes = RepClientes.getInstance().getClientes();
        for (Cliente cliente : clientes) {
            if(cliente.equals(c))
                return cliente;
        }
        return null;
    }
}
