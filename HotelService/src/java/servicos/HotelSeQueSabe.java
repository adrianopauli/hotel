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
 * @author Lucas
 */
@WebService(serviceName = "HotelSeQueSabe")
public class HotelSeQueSabe {

    /**
     * Operação de Web service para cadastrar um cliente
     */
    @WebMethod(operationName = "cadastroCliente")
    @Oneway
    public void cadastroCliente(@WebParam(name = "cliente") Cliente cliente) {
        RepClientes.getInstance().adicionaCliente(cliente);
        System.out.println("Cadastro = " + cliente.getNome());
    }

    /**
     * Operação de Web service que retorna os quartos disponiveis para uma data passado
     */
    @WebMethod(operationName = "consultaQuartosDisponiveis")
    public List<Quarto> consultaQuartosDisponiveis(@WebParam(name = "data") long data) {
        List<Quarto> disponivels = new ArrayList<Quarto>(RepQuartos.getInstance().getQuartos());
        Date d = new Date(data);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String format = sdf.format(d);
        for (Reserva reserva : RepReservas.getInstance().getReservas()) {
            String dataReserva = sdf.format(reserva.getData());
            System.out.println(format+"--+"+dataReserva);
            if (dataReserva.equals(format)) {
                disponivels.remove(reserva.getQuarto());
            }
        }
        return disponivels;
    }

    /**
     * Operação de Web service que retorna as reservas por cliente
     */
    @WebMethod(operationName = "minhasReservas")
    public List<Reserva> minhasReservas(@WebParam(name = "cliente") Cliente cliente) {
        List<Reserva> reservas = new ArrayList<Reserva>();
        System.out.println("lista" + RepReservas.getInstance().getReservas());
        for (Reserva reserva : RepReservas.getInstance().getReservas()) {
            if (cliente.getNome().equals(reserva.getCliente().getNome())) {
                reservas.add(reserva);
            }
        }
        return reservas;
    }

    /**
     * Operação de Web service para cadastrar uma reserva
     */
    @WebMethod(operationName = "cadastrarReserva")
    public Boolean cadastrarReserva(@WebParam(name = "cliente") Cliente cliente, @WebParam(name = "data") long data, @WebParam(name = "quarto") Quarto quarto) {
        Reserva r = new Reserva();
        r.setCliente(cliente);
        Date d = new Date(data);
        r.setData(d);
        r.setQuarto(quarto);
        RepReservas.getInstance().adicionarReserva(r);
        System.out.println("RESERVA REALIZADA!\n"+cliente.getNome()+"quarto = "+quarto.getDescricao()+d);
        return true;
    }

    /**
     * Realizar a autenticação de um cliente
     */
    @WebMethod(operationName = "login")
    public Cliente login(@WebParam(name = "cliente") Cliente c) {
        List<Cliente> clientes = RepClientes.getInstance().getClientes();
        for (Cliente cliente : clientes) {
            if (cliente.equals(c)) {
                return cliente;
            }
        }
        return null;
    }

    /**
     * Operação de Web service para cancelar uma reserva
     */
    @WebMethod(operationName = "cancelar")
    public Boolean cancelar(@WebParam(name = "cliente")Reserva reserva) {
        List<Reserva> reservas = RepReservas.getInstance().getReservas();
        for (Reserva r : reservas) {
            if (r.equals(reserva)) {
                reservas.remove(r);
                return true;
            }
        }
        return false;
    }
}
