
package Services;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PersonaService", targetNamespace = "http://Servicios/", wsdlLocation = "http://localhost:17225/MisOfertasWebService/PersonaService?WSDL")
public class PersonaService_Service
    extends Service
{

    private final static URL PERSONASERVICE_WSDL_LOCATION;
    private final static WebServiceException PERSONASERVICE_EXCEPTION;
    private final static QName PERSONASERVICE_QNAME = new QName("http://Servicios/", "PersonaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:17225/MisOfertasWebService/PersonaService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PERSONASERVICE_WSDL_LOCATION = url;
        PERSONASERVICE_EXCEPTION = e;
    }

    public PersonaService_Service() {
        super(__getWsdlLocation(), PERSONASERVICE_QNAME);
    }

    public PersonaService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PERSONASERVICE_QNAME, features);
    }

    public PersonaService_Service(URL wsdlLocation) {
        super(wsdlLocation, PERSONASERVICE_QNAME);
    }

    public PersonaService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PERSONASERVICE_QNAME, features);
    }

    public PersonaService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonaService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PersonaService
     */
    @WebEndpoint(name = "PersonaServicePort")
    public PersonaService getPersonaServicePort() {
        return super.getPort(new QName("http://Servicios/", "PersonaServicePort"), PersonaService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonaService
     */
    @WebEndpoint(name = "PersonaServicePort")
    public PersonaService getPersonaServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servicios/", "PersonaServicePort"), PersonaService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PERSONASERVICE_EXCEPTION!= null) {
            throw PERSONASERVICE_EXCEPTION;
        }
        return PERSONASERVICE_WSDL_LOCATION;
    }

}
