
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

    private final static QName _CrearOfertaLocal_QNAME = new QName("http://Servicios/", "Crear_oferta_local");
    private final static QName _CrearOfertaLocalResponse_QNAME = new QName("http://Servicios/", "Crear_oferta_localResponse");
    private final static QName _EliminarOfertaLocal_QNAME = new QName("http://Servicios/", "Eliminar_oferta_local");
    private final static QName _EliminarOfertaLocalResponse_QNAME = new QName("http://Servicios/", "Eliminar_oferta_localResponse");
    private final static QName _ListadoOfertaLocal_QNAME = new QName("http://Servicios/", "Listado_oferta_local");
    private final static QName _ListadoOfertaLocalResponse_QNAME = new QName("http://Servicios/", "Listado_oferta_localResponse");
    private final static QName _Ciudad_QNAME = new QName("http://Servicios/", "ciudad");
    private final static QName _Empresa_QNAME = new QName("http://Servicios/", "empresa");
    private final static QName _Estado_QNAME = new QName("http://Servicios/", "estado");
    private final static QName _Local_QNAME = new QName("http://Servicios/", "local");
    private final static QName _Oferta_QNAME = new QName("http://Servicios/", "oferta");
    private final static QName _Ofertalocal_QNAME = new QName("http://Servicios/", "ofertalocal");
    private final static QName _Region_QNAME = new QName("http://Servicios/", "region");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearOfertaLocal }
     * 
     */
    public CrearOfertaLocal createCrearOfertaLocal() {
        return new CrearOfertaLocal();
    }

    /**
     * Create an instance of {@link CrearOfertaLocalResponse }
     * 
     */
    public CrearOfertaLocalResponse createCrearOfertaLocalResponse() {
        return new CrearOfertaLocalResponse();
    }

    /**
     * Create an instance of {@link EliminarOfertaLocal }
     * 
     */
    public EliminarOfertaLocal createEliminarOfertaLocal() {
        return new EliminarOfertaLocal();
    }

    /**
     * Create an instance of {@link EliminarOfertaLocalResponse }
     * 
     */
    public EliminarOfertaLocalResponse createEliminarOfertaLocalResponse() {
        return new EliminarOfertaLocalResponse();
    }

    /**
     * Create an instance of {@link ListadoOfertaLocal }
     * 
     */
    public ListadoOfertaLocal createListadoOfertaLocal() {
        return new ListadoOfertaLocal();
    }

    /**
     * Create an instance of {@link ListadoOfertaLocalResponse }
     * 
     */
    public ListadoOfertaLocalResponse createListadoOfertaLocalResponse() {
        return new ListadoOfertaLocalResponse();
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
     * Create an instance of {@link Oferta }
     * 
     */
    public Oferta createOferta() {
        return new Oferta();
    }

    /**
     * Create an instance of {@link Ofertalocal }
     * 
     */
    public Ofertalocal createOfertalocal() {
        return new Ofertalocal();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link OfertalocalPK }
     * 
     */
    public OfertalocalPK createOfertalocalPK() {
        return new OfertalocalPK();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearOfertaLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_oferta_local")
    public JAXBElement<CrearOfertaLocal> createCrearOfertaLocal(CrearOfertaLocal value) {
        return new JAXBElement<CrearOfertaLocal>(_CrearOfertaLocal_QNAME, CrearOfertaLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearOfertaLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_oferta_localResponse")
    public JAXBElement<CrearOfertaLocalResponse> createCrearOfertaLocalResponse(CrearOfertaLocalResponse value) {
        return new JAXBElement<CrearOfertaLocalResponse>(_CrearOfertaLocalResponse_QNAME, CrearOfertaLocalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarOfertaLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_oferta_local")
    public JAXBElement<EliminarOfertaLocal> createEliminarOfertaLocal(EliminarOfertaLocal value) {
        return new JAXBElement<EliminarOfertaLocal>(_EliminarOfertaLocal_QNAME, EliminarOfertaLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarOfertaLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_oferta_localResponse")
    public JAXBElement<EliminarOfertaLocalResponse> createEliminarOfertaLocalResponse(EliminarOfertaLocalResponse value) {
        return new JAXBElement<EliminarOfertaLocalResponse>(_EliminarOfertaLocalResponse_QNAME, EliminarOfertaLocalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoOfertaLocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_oferta_local")
    public JAXBElement<ListadoOfertaLocal> createListadoOfertaLocal(ListadoOfertaLocal value) {
        return new JAXBElement<ListadoOfertaLocal>(_ListadoOfertaLocal_QNAME, ListadoOfertaLocal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoOfertaLocalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_oferta_localResponse")
    public JAXBElement<ListadoOfertaLocalResponse> createListadoOfertaLocalResponse(ListadoOfertaLocalResponse value) {
        return new JAXBElement<ListadoOfertaLocalResponse>(_ListadoOfertaLocalResponse_QNAME, ListadoOfertaLocalResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Oferta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "oferta")
    public JAXBElement<Oferta> createOferta(Oferta value) {
        return new JAXBElement<Oferta>(_Oferta_QNAME, Oferta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ofertalocal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "ofertalocal")
    public JAXBElement<Ofertalocal> createOfertalocal(Ofertalocal value) {
        return new JAXBElement<Ofertalocal>(_Ofertalocal_QNAME, Ofertalocal.class, null, value);
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
