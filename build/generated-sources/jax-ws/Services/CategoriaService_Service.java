
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
@WebServiceClient(name = "CategoriaService", targetNamespace = "http://Servicios/", wsdlLocation = "http://localhost:17225/MisOfertasWebService/CategoriaService?wsdl")
public class CategoriaService_Service
    extends Service
{

    private final static URL CATEGORIASERVICE_WSDL_LOCATION;
    private final static WebServiceException CATEGORIASERVICE_EXCEPTION;
    private final static QName CATEGORIASERVICE_QNAME = new QName("http://Servicios/", "CategoriaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:17225/MisOfertasWebService/CategoriaService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CATEGORIASERVICE_WSDL_LOCATION = url;
        CATEGORIASERVICE_EXCEPTION = e;
    }

    public CategoriaService_Service() {
        super(__getWsdlLocation(), CATEGORIASERVICE_QNAME);
    }

    public CategoriaService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CATEGORIASERVICE_QNAME, features);
    }

    public CategoriaService_Service(URL wsdlLocation) {
        super(wsdlLocation, CATEGORIASERVICE_QNAME);
    }

    public CategoriaService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CATEGORIASERVICE_QNAME, features);
    }

    public CategoriaService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CategoriaService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CategoriaService
     */
    @WebEndpoint(name = "CategoriaServicePort")
    public CategoriaService getCategoriaServicePort() {
        return super.getPort(new QName("http://Servicios/", "CategoriaServicePort"), CategoriaService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CategoriaService
     */
    @WebEndpoint(name = "CategoriaServicePort")
    public CategoriaService getCategoriaServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Servicios/", "CategoriaServicePort"), CategoriaService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CATEGORIASERVICE_EXCEPTION!= null) {
            throw CATEGORIASERVICE_EXCEPTION;
        }
        return CATEGORIASERVICE_WSDL_LOCATION;
    }

}