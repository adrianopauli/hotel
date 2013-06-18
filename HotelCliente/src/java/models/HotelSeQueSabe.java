
package models;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HotelSeQueSabe", targetNamespace = "http://servicos/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HotelSeQueSabe {


    /**
     * 
     * @param cliente
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "cadastroCliente", targetNamespace = "http://servicos/", className = "models.CadastroCliente")
    @Action(input = "http://servicos/HotelSeQueSabe/cadastroCliente")
    public void cadastroCliente(
        @WebParam(name = "cliente", targetNamespace = "")
        Cliente cliente);

    /**
     * 
     * @param cliente
     * @return
     *     returns java.util.List<models.Reserva>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "minhasReservas", targetNamespace = "http://servicos/", className = "models.MinhasReservas")
    @ResponseWrapper(localName = "minhasReservasResponse", targetNamespace = "http://servicos/", className = "models.MinhasReservasResponse")
    @Action(input = "http://servicos/HotelSeQueSabe/minhasReservasRequest", output = "http://servicos/HotelSeQueSabe/minhasReservasResponse")
    public List<Reserva> minhasReservas(
        @WebParam(name = "cliente", targetNamespace = "")
        Cliente cliente);

    /**
     * 
     * @param quarto
     * @param cliente
     * @param data
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cadastrarReserva", targetNamespace = "http://servicos/", className = "models.CadastrarReserva")
    @ResponseWrapper(localName = "cadastrarReservaResponse", targetNamespace = "http://servicos/", className = "models.CadastrarReservaResponse")
    @Action(input = "http://servicos/HotelSeQueSabe/cadastrarReservaRequest", output = "http://servicos/HotelSeQueSabe/cadastrarReservaResponse")
    public Boolean cadastrarReserva(
        @WebParam(name = "cliente", targetNamespace = "")
        Cliente cliente,
        @WebParam(name = "data", targetNamespace = "")
        Long data,
        @WebParam(name = "quarto", targetNamespace = "")
        Quarto quarto);

    /**
     * 
     * @param cliente
     * @return
     *     returns models.Cliente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://servicos/", className = "models.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://servicos/", className = "models.LoginResponse")
    @Action(input = "http://servicos/HotelSeQueSabe/loginRequest", output = "http://servicos/HotelSeQueSabe/loginResponse")
    public Cliente login(
        @WebParam(name = "cliente", targetNamespace = "")
        Cliente cliente);

    /**
     * 
     * @param data
     * @return
     *     returns java.util.List<models.Quarto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaQuartosDisponiveis", targetNamespace = "http://servicos/", className = "models.ConsultaQuartosDisponiveis")
    @ResponseWrapper(localName = "consultaQuartosDisponiveisResponse", targetNamespace = "http://servicos/", className = "models.ConsultaQuartosDisponiveisResponse")
    @Action(input = "http://servicos/HotelSeQueSabe/consultaQuartosDisponiveisRequest", output = "http://servicos/HotelSeQueSabe/consultaQuartosDisponiveisResponse")
    public List<Quarto> consultaQuartosDisponiveis(
        @WebParam(name = "data", targetNamespace = "")
        long data);

}
