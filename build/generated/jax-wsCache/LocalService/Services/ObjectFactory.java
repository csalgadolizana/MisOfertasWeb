
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

    private final static QName _CrearLocal_QNAME = new QName("http://Servicios/", "Crear_local");
    private final static QName _CrearLocalResponse_QNAME = new QName("http://Servicios/", "Crear_localResponse");
    private final static QName _EliminarLocal_QNAME = new QName("http://Servicios/", "Eliminar_local");
    private final static QName _EliminarLocalResponse_QNAME = new QName("http://Servicios/", "Eliminar_localResponse");
    private final static QName _ListadoLocal_QNAME = new QName("http://Servicios/", "Listado_local");
    private final static QName _ListadoLocalResponse_QNAME = new QName("http://Servicios/", "Listado_localResponse");
    private final static QName _ModificarLocal_QNAME = new QName("http://Servicios/", "Modificar_local");
    private final static QName _ModificarLocalResponse_QNAME = new QName("http://Servicios/", "Modificar_localResponse");
    private final static QName _Ciudad_QNAME = new QName("http://Servicios/", "ciudad");
    private final static QName _Empresa_QNAME = new QName("http://Servicios/", "empresa");
    private final static QName _Estado_QNAME = new QName("http://Servicios/", "estado");
    private final static QName _Local_QNAME = new QName("http://Servicios/", "local");
    private final static QName _Region_QNAME = new QName("http://Servicios/", "region");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearLocal }
     * 
     */
    public CrearLocal createCrearLocal() {
        return new CrearLocal();
    }

    /**
     * Create an instance of {@link CrearLocalResponse }
     * 
     */
    public CrearLocalResponse createCrearLocalResponse() {
        return new CrearLocalResponse();
    }

    /**
     * Create an instance of {@link EliminarLocal }
     * 
     */
    public EliminarLocal createEliminarLocal() {
        return new EliminarLocal();
    }

    /**
     * Create an instance of {@link EliminarLocalResponse }
     * 
     */
    public EliminarLocalResponse createEliminarLocalResponse() {
        return new EliminarLocalResponse();
    }

    /**
     * Create an instance of {@link ListadoLocal }
     * 
     */
    public ListadoLocal createListadoLocal() {
        return new ListadoLocal();
    }

    /**
     * Create an instance of {@link ListadoLocalResponse }
     * 
     */
    public ListadoLocalResponse createListadoLocalResponse() {
        return new ListadoLocalResponse();
    }

    /**
     * Create an instance of {@link ModificarLocal }
     * 
     */
    public ModificarLocal createModificarLocal() {
        return new ModificarLocal();
    }

    /**
     * Create an instance of {@link ModificarLocalResponse }
     * 
     */
    public ModificarLocalResponse createModificarLocalResponse() {
        return new ModificarLocalResponse();
    }

    /**
     * Create an instance of {@link Ciudad }
     * 
     */
    public Ciudad createCiudad() {
        return new Ciudad();
    }

    /**
     * Create an instance of {@link Empresa }
     * 
     */
    public Empresa createEmpresa() {
        return new Empresa();
    }

    /**
     * Create an instance of {@link Estado }
     * 
     */
    public Estado createEstado() {
        return new Estado();
    }

    /**
     * Create an instance of {@link Local }
     * 
     */
    public Local createLocal() {
        return new Local();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_local")
    public JAXBElement<CrearLocal> createCrearLocal(CrearLocal value) {
        return new JAXBElement<CrearLocal>(_CrearLocal_QNAME, CrearLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_localResponse")
    public JAXBElement<CrearLocalResponse> createCrearLocalResponse(CrearLocalResponse value) {
        return new JAXBElement<CrearLocalResponse>(_CrearLocalResponse_QNAME, CrearLocalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_local")
    public JAXBElement<EliminarLocal> createEliminarLocal(EliminarLocal value) {
        return new JAXBElement<EliminarLocal>(_EliminarLocal_QNAME, EliminarLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_localResponse")
    public JAXBElement<EliminarLocalResponse> createEliminarLocalResponse(EliminarLocalResponse value) {
        return new JAXBElement<EliminarLocalResponse>(_EliminarLocalResponse_QNAME, EliminarLocalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_local")
    public JAXBElement<ListadoLocal> createListadoLocal(ListadoLocal value) {
        return new JAXBElement<ListadoLocal>(_ListadoLocal_QNAME, ListadoLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_localResponse")
    public JAXBElement<ListadoLocalResponse> createListadoLocalResponse(ListadoLocalResponse value) {
        return new JAXBElement<ListadoLocalResponse>(_ListadoLocalResponse_QNAME, ListadoLocalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_local")
    public JAXBElement<ModificarLocal> createModificarLocal(ModificarLocal value) {
        return new JAXBElement<ModificarLocal>(_ModificarLocal_QNAME, ModificarLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_localResponse")
    public JAXBElement<ModificarLocalResponse> createModificarLocalResponse(ModificarLocalResponse value) {
        return new JAXBElement<ModificarLocalResponse>(_ModificarLocalResponse_QNAME, ModificarLocalResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Empresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "empresa")
    public JAXBElement<Empresa> createEmpresa(Empresa value) {
        return new JAXBElement<Empresa>(_Empresa_QNAME, Empresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "estado")
    public JAXBElement<Estado> createEstado(Estado value) {
        return new JAXBElement<Estado>(_Estado_QNAME, Estado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Local }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "local")
    public JAXBElement<Local> createLocal(Local value) {
        return new JAXBElement<Local>(_Local_QNAME, Local.class, null, value);
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
