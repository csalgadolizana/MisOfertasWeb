
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

    private final static QName _CrearOfertaVisitas_QNAME = new QName("http://Servicios/", "Crear_oferta_visitas");
    private final static QName _CrearOfertaVisitasResponse_QNAME = new QName("http://Servicios/", "Crear_oferta_visitasResponse");
    private final static QName _EliminarOfertaVisitas_QNAME = new QName("http://Servicios/", "Eliminar_oferta_visitas");
    private final static QName _EliminarOfertaVisitasResponse_QNAME = new QName("http://Servicios/", "Eliminar_oferta_visitasResponse");
    private final static QName _ListadoOfertaVisitas_QNAME = new QName("http://Servicios/", "Listado_oferta_visitas");
    private final static QName _ListadoOfertaVisitasResponse_QNAME = new QName("http://Servicios/", "Listado_oferta_visitasResponse");
    private final static QName _Ciudad_QNAME = new QName("http://Servicios/", "ciudad");
    private final static QName _Cliente_QNAME = new QName("http://Servicios/", "cliente");
    private final static QName _Estado_QNAME = new QName("http://Servicios/", "estado");
    private final static QName _Oferta_QNAME = new QName("http://Servicios/", "oferta");
    private final static QName _Ofertavisi_QNAME = new QName("http://Servicios/", "ofertavisi");
    private final static QName _Persona_QNAME = new QName("http://Servicios/", "persona");
    private final static QName _Region_QNAME = new QName("http://Servicios/", "region");
    private final static QName _Sexo_QNAME = new QName("http://Servicios/", "sexo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearOfertaVisitas }
     * 
     */
    public CrearOfertaVisitas createCrearOfertaVisitas() {
        return new CrearOfertaVisitas();
    }

    /**
     * Create an instance of {@link CrearOfertaVisitasResponse }
     * 
     */
    public CrearOfertaVisitasResponse createCrearOfertaVisitasResponse() {
        return new CrearOfertaVisitasResponse();
    }

    /**
     * Create an instance of {@link EliminarOfertaVisitas }
     * 
     */
    public EliminarOfertaVisitas createEliminarOfertaVisitas() {
        return new EliminarOfertaVisitas();
    }

    /**
     * Create an instance of {@link EliminarOfertaVisitasResponse }
     * 
     */
    public EliminarOfertaVisitasResponse createEliminarOfertaVisitasResponse() {
        return new EliminarOfertaVisitasResponse();
    }

    /**
     * Create an instance of {@link ListadoOfertaVisitas }
     * 
     */
    public ListadoOfertaVisitas createListadoOfertaVisitas() {
        return new ListadoOfertaVisitas();
    }

    /**
     * Create an instance of {@link ListadoOfertaVisitasResponse }
     * 
     */
    public ListadoOfertaVisitasResponse createListadoOfertaVisitasResponse() {
        return new ListadoOfertaVisitasResponse();
    }

    /**
     * Create an instance of {@link Ciudad }
     * 
     */
    public Ciudad createCiudad() {
        return new Ciudad();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Estado }
     * 
     */
    public Estado createEstado() {
        return new Estado();
    }

    /**
     * Create an instance of {@link Oferta }
     * 
     */
    public Oferta createOferta() {
        return new Oferta();
    }

    /**
     * Create an instance of {@link Ofertavisi }
     * 
     */
    public Ofertavisi createOfertavisi() {
        return new Ofertavisi();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link Sexo }
     * 
     */
    public Sexo createSexo() {
        return new Sexo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearOfertaVisitas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_oferta_visitas")
    public JAXBElement<CrearOfertaVisitas> createCrearOfertaVisitas(CrearOfertaVisitas value) {
        return new JAXBElement<CrearOfertaVisitas>(_CrearOfertaVisitas_QNAME, CrearOfertaVisitas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearOfertaVisitasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_oferta_visitasResponse")
    public JAXBElement<CrearOfertaVisitasResponse> createCrearOfertaVisitasResponse(CrearOfertaVisitasResponse value) {
        return new JAXBElement<CrearOfertaVisitasResponse>(_CrearOfertaVisitasResponse_QNAME, CrearOfertaVisitasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarOfertaVisitas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_oferta_visitas")
    public JAXBElement<EliminarOfertaVisitas> createEliminarOfertaVisitas(EliminarOfertaVisitas value) {
        return new JAXBElement<EliminarOfertaVisitas>(_EliminarOfertaVisitas_QNAME, EliminarOfertaVisitas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarOfertaVisitasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_oferta_visitasResponse")
    public JAXBElement<EliminarOfertaVisitasResponse> createEliminarOfertaVisitasResponse(EliminarOfertaVisitasResponse value) {
        return new JAXBElement<EliminarOfertaVisitasResponse>(_EliminarOfertaVisitasResponse_QNAME, EliminarOfertaVisitasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoOfertaVisitas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_oferta_visitas")
    public JAXBElement<ListadoOfertaVisitas> createListadoOfertaVisitas(ListadoOfertaVisitas value) {
        return new JAXBElement<ListadoOfertaVisitas>(_ListadoOfertaVisitas_QNAME, ListadoOfertaVisitas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoOfertaVisitasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_oferta_visitasResponse")
    public JAXBElement<ListadoOfertaVisitasResponse> createListadoOfertaVisitasResponse(ListadoOfertaVisitasResponse value) {
        return new JAXBElement<ListadoOfertaVisitasResponse>(_ListadoOfertaVisitasResponse_QNAME, ListadoOfertaVisitasResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Oferta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "oferta")
    public JAXBElement<Oferta> createOferta(Oferta value) {
        return new JAXBElement<Oferta>(_Oferta_QNAME, Oferta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ofertavisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "ofertavisi")
    public JAXBElement<Ofertavisi> createOfertavisi(Ofertavisi value) {
        return new JAXBElement<Ofertavisi>(_Ofertavisi_QNAME, Ofertavisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "persona")
    public JAXBElement<Persona> createPersona(Persona value) {
        return new JAXBElement<Persona>(_Persona_QNAME, Persona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Region }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "region")
    public JAXBElement<Region> createRegion(Region value) {
        return new JAXBElement<Region>(_Region_QNAME, Region.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sexo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "sexo")
    public JAXBElement<Sexo> createSexo(Sexo value) {
        return new JAXBElement<Sexo>(_Sexo_QNAME, Sexo.class, null, value);
    }

}
