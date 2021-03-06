
package models;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HotelSeQueSabe", targetNamespace = "http://servicos/", wsdlLocation = "http://localhost:8080/HotelService/HotelSeQueSabe?wsdl")
public class HotelSeQueSabe_Service
    extends Service
{

    private final static URL HOTELSEQUESABE_WSDL_LOCATION;
    private final static WebServiceException HOTELSEQUESABE_EXCEPTION;
    private final static QName HOTELSEQUESABE_QNAME = new QName("http://servicos/", "HotelSeQueSabe");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/HotelService/HotelSeQueSabe?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HOTELSEQUESABE_WSDL_LOCATION = url;
        HOTELSEQUESABE_EXCEPTION = e;
    }

    public HotelSeQueSabe_Service() {
        super(__getWsdlLocation(), HOTELSEQUESABE_QNAME);
    }

    public HotelSeQueSabe_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), HOTELSEQUESABE_QNAME, features);
    }

    public HotelSeQueSabe_Service(URL wsdlLocation) {
        super(wsdlLocation, HOTELSEQUESABE_QNAME);
    }

    public HotelSeQueSabe_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HOTELSEQUESABE_QNAME, features);
    }

    public HotelSeQueSabe_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelSeQueSabe_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HotelSeQueSabe
     */
    @WebEndpoint(name = "HotelSeQueSabePort")
    public HotelSeQueSabe getHotelSeQueSabePort() {
        return super.getPort(new QName("http://servicos/", "HotelSeQueSabePort"), HotelSeQueSabe.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelSeQueSabe
     */
    @WebEndpoint(name = "HotelSeQueSabePort")
    public HotelSeQueSabe getHotelSeQueSabePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicos/", "HotelSeQueSabePort"), HotelSeQueSabe.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HOTELSEQUESABE_EXCEPTION!= null) {
            throw HOTELSEQUESABE_EXCEPTION;
        }
        return HOTELSEQUESABE_WSDL_LOCATION;
    }

}
