
package models;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the models package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Login_QNAME = new QName("http://servicos/", "login");
    private final static QName _ConsultaQuartosDisponiveisResponse_QNAME = new QName("http://servicos/", "consultaQuartosDisponiveisResponse");
    private final static QName _MinhasReservasResponse_QNAME = new QName("http://servicos/", "minhasReservasResponse");
    private final static QName _MinhasReservas_QNAME = new QName("http://servicos/", "minhasReservas");
    private final static QName _CadastrarReservaResponse_QNAME = new QName("http://servicos/", "cadastrarReservaResponse");
    private final static QName _CadastroCliente_QNAME = new QName("http://servicos/", "cadastroCliente");
    private final static QName _CadastrarReserva_QNAME = new QName("http://servicos/", "cadastrarReserva");
    private final static QName _ConsultaQuartosDisponiveis_QNAME = new QName("http://servicos/", "consultaQuartosDisponiveis");
    private final static QName _LoginResponse_QNAME = new QName("http://servicos/", "loginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: models
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CadastroCliente }
     * 
     */
    public CadastroCliente createCadastroCliente() {
        return new CadastroCliente();
    }

    /**
     * Create an instance of {@link CadastrarReservaResponse }
     * 
     */
    public CadastrarReservaResponse createCadastrarReservaResponse() {
        return new CadastrarReservaResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ConsultaQuartosDisponiveis }
     * 
     */
    public ConsultaQuartosDisponiveis createConsultaQuartosDisponiveis() {
        return new ConsultaQuartosDisponiveis();
    }

    /**
     * Create an instance of {@link CadastrarReserva }
     * 
     */
    public CadastrarReserva createCadastrarReserva() {
        return new CadastrarReserva();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link MinhasReservasResponse }
     * 
     */
    public MinhasReservasResponse createMinhasReservasResponse() {
        return new MinhasReservasResponse();
    }

    /**
     * Create an instance of {@link ConsultaQuartosDisponiveisResponse }
     * 
     */
    public ConsultaQuartosDisponiveisResponse createConsultaQuartosDisponiveisResponse() {
        return new ConsultaQuartosDisponiveisResponse();
    }

    /**
     * Create an instance of {@link MinhasReservas }
     * 
     */
    public MinhasReservas createMinhasReservas() {
        return new MinhasReservas();
    }

    /**
     * Create an instance of {@link Quarto }
     * 
     */
    public Quarto createQuarto() {
        return new Quarto();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Reserva }
     * 
     */
    public Reserva createReserva() {
        return new Reserva();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaQuartosDisponiveisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos/", name = "consultaQuartosDisponiveisResponse")
    public JAXBElement<ConsultaQuartosDisponiveisResponse> createConsultaQuartosDisponiveisResponse(ConsultaQuartosDisponiveisResponse value) {
        return new JAXBElement<ConsultaQuartosDisponiveisResponse>(_ConsultaQuartosDisponiveisResponse_QNAME, ConsultaQuartosDisponiveisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinhasReservasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos/", name = "minhasReservasResponse")
    public JAXBElement<MinhasReservasResponse> createMinhasReservasResponse(MinhasReservasResponse value) {
        return new JAXBElement<MinhasReservasResponse>(_MinhasReservasResponse_QNAME, MinhasReservasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinhasReservas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos/", name = "minhasReservas")
    public JAXBElement<MinhasReservas> createMinhasReservas(MinhasReservas value) {
        return new JAXBElement<MinhasReservas>(_MinhasReservas_QNAME, MinhasReservas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos/", name = "cadastrarReservaResponse")
    public JAXBElement<CadastrarReservaResponse> createCadastrarReservaResponse(CadastrarReservaResponse value) {
        return new JAXBElement<CadastrarReservaResponse>(_CadastrarReservaResponse_QNAME, CadastrarReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastroCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos/", name = "cadastroCliente")
    public JAXBElement<CadastroCliente> createCadastroCliente(CadastroCliente value) {
        return new JAXBElement<CadastroCliente>(_CadastroCliente_QNAME, CadastroCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos/", name = "cadastrarReserva")
    public JAXBElement<CadastrarReserva> createCadastrarReserva(CadastrarReserva value) {
        return new JAXBElement<CadastrarReserva>(_CadastrarReserva_QNAME, CadastrarReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaQuartosDisponiveis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos/", name = "consultaQuartosDisponiveis")
    public JAXBElement<ConsultaQuartosDisponiveis> createConsultaQuartosDisponiveis(ConsultaQuartosDisponiveis value) {
        return new JAXBElement<ConsultaQuartosDisponiveis>(_ConsultaQuartosDisponiveis_QNAME, ConsultaQuartosDisponiveis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

}
