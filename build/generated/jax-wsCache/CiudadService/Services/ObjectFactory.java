
package Services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Services package. 
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

    private final static QName _ListadoCiudades_QNAME = new QName("http://Servicios/", "Listado_ciudades");
    private final static QName _ListadoCiudadesResponse_QNAME = new QName("http://Servicios/", "Listado_ciudadesResponse");
    private final static QName _Ciudad_QNAME = new QName("http://Servicios/", "ciudad");
    private final static QName _Region_QNAME = new QName("http://Servicios/", "region");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListadoCiudades }
     * 
     */
    public ListadoCiudades createListadoCiudades() {
        return new ListadoCiudades();
    }

    /**
     * Create an instance of {@link ListadoCiudadesResponse }
     * 
     */
    public ListadoCiudadesResponse createListadoCiudadesResponse() {
        return new ListadoCiudadesResponse();
    }

    /**
     * Create an instance of {@link Ciudad }
     * 
     */
    public Ciudad createCiudad() {
        return new Ciudad();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoCiudades }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_ciudades")
    public JAXBElement<ListadoCiudades> createListadoCiudades(ListadoCiudades value) {
        return new JAXBElement<ListadoCiudades>(_ListadoCiudades_QNAME, ListadoCiudades.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoCiudadesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_ciudadesResponse")
    public JAXBElement<ListadoCiudadesResponse> createListadoCiudadesResponse(ListadoCiudadesResponse value) {
        return new JAXBElement<ListadoCiudadesResponse>(_ListadoCiudadesResponse_QNAME, ListadoCiudadesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ciudad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "ciudad")
    public JAXBElement<Ciudad> createCiudad(Ciudad value) {
        return new JAXBElement<Ciudad>(_Ciudad_QNAME, Ciudad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Region }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "region")
    public JAXBElement<Region> createRegion(Region value) {
        return new JAXBElement<Region>(_Region_QNAME, Region.class, null, value);
    }

}
