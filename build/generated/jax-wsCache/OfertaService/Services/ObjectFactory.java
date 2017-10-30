
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

    private final static QName _CrearOferta_QNAME = new QName("http://Servicios/", "Crear_oferta");
    private final static QName _CrearOfertaResponse_QNAME = new QName("http://Servicios/", "Crear_ofertaResponse");
    private final static QName _EliminarOferta_QNAME = new QName("http://Servicios/", "Eliminar_oferta");
    private final static QName _EliminarOfertaResponse_QNAME = new QName("http://Servicios/", "Eliminar_ofertaResponse");
    private final static QName _ListadoOferta_QNAME = new QName("http://Servicios/", "Listado_oferta");
    private final static QName _ListadoOfertaResponse_QNAME = new QName("http://Servicios/", "Listado_ofertaResponse");
    private final static QName _ModificarOferta_QNAME = new QName("http://Servicios/", "Modificar_oferta");
    private final static QName _ModificarOfertaResponse_QNAME = new QName("http://Servicios/", "Modificar_ofertaResponse");
    private final static QName _Estado_QNAME = new QName("http://Servicios/", "estado");
    private final static QName _Oferta_QNAME = new QName("http://Servicios/", "oferta");
    private final static QName _PublicarOferta_QNAME = new QName("http://Servicios/", "publicar_oferta");
    private final static QName _PublicarOfertaResponse_QNAME = new QName("http://Servicios/", "publicar_ofertaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearOferta }
     * 
     */
    public CrearOferta createCrearOferta() {
        return new CrearOferta();
    }

    /**
     * Create an instance of {@link CrearOfertaResponse }
     * 
     */
    public CrearOfertaResponse createCrearOfertaResponse() {
        return new CrearOfertaResponse();
    }

    /**
     * Create an instance of {@link EliminarOferta }
     * 
     */
    public EliminarOferta createEliminarOferta() {
        return new EliminarOferta();
    }

    /**
     * Create an instance of {@link EliminarOfertaResponse }
     * 
     */
    public EliminarOfertaResponse createEliminarOfertaResponse() {
        return new EliminarOfertaResponse();
    }

    /**
     * Create an instance of {@link ListadoOferta }
     * 
     */
    public ListadoOferta createListadoOferta() {
        return new ListadoOferta();
    }

    /**
     * Create an instance of {@link ListadoOfertaResponse }
     * 
     */
    public ListadoOfertaResponse createListadoOfertaResponse() {
        return new ListadoOfertaResponse();
    }

    /**
     * Create an instance of {@link ModificarOferta }
     * 
     */
    public ModificarOferta createModificarOferta() {
        return new ModificarOferta();
    }

    /**
     * Create an instance of {@link ModificarOfertaResponse }
     * 
     */
    public ModificarOfertaResponse createModificarOfertaResponse() {
        return new ModificarOfertaResponse();
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
     * Create an instance of {@link PublicarOferta }
     * 
     */
    public PublicarOferta createPublicarOferta() {
        return new PublicarOferta();
    }

    /**
     * Create an instance of {@link PublicarOfertaResponse }
     * 
     */
    public PublicarOfertaResponse createPublicarOfertaResponse() {
        return new PublicarOfertaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearOferta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_oferta")
    public JAXBElement<CrearOferta> createCrearOferta(CrearOferta value) {
        return new JAXBElement<CrearOferta>(_CrearOferta_QNAME, CrearOferta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearOfertaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_ofertaResponse")
    public JAXBElement<CrearOfertaResponse> createCrearOfertaResponse(CrearOfertaResponse value) {
        return new JAXBElement<CrearOfertaResponse>(_CrearOfertaResponse_QNAME, CrearOfertaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarOferta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_oferta")
    public JAXBElement<EliminarOferta> createEliminarOferta(EliminarOferta value) {
        return new JAXBElement<EliminarOferta>(_EliminarOferta_QNAME, EliminarOferta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarOfertaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_ofertaResponse")
    public JAXBElement<EliminarOfertaResponse> createEliminarOfertaResponse(EliminarOfertaResponse value) {
        return new JAXBElement<EliminarOfertaResponse>(_EliminarOfertaResponse_QNAME, EliminarOfertaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoOferta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_oferta")
    public JAXBElement<ListadoOferta> createListadoOferta(ListadoOferta value) {
        return new JAXBElement<ListadoOferta>(_ListadoOferta_QNAME, ListadoOferta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoOfertaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_ofertaResponse")
    public JAXBElement<ListadoOfertaResponse> createListadoOfertaResponse(ListadoOfertaResponse value) {
        return new JAXBElement<ListadoOfertaResponse>(_ListadoOfertaResponse_QNAME, ListadoOfertaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarOferta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_oferta")
    public JAXBElement<ModificarOferta> createModificarOferta(ModificarOferta value) {
        return new JAXBElement<ModificarOferta>(_ModificarOferta_QNAME, ModificarOferta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarOfertaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_ofertaResponse")
    public JAXBElement<ModificarOfertaResponse> createModificarOfertaResponse(ModificarOfertaResponse value) {
        return new JAXBElement<ModificarOfertaResponse>(_ModificarOfertaResponse_QNAME, ModificarOfertaResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicarOferta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "publicar_oferta")
    public JAXBElement<PublicarOferta> createPublicarOferta(PublicarOferta value) {
        return new JAXBElement<PublicarOferta>(_PublicarOferta_QNAME, PublicarOferta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublicarOfertaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "publicar_ofertaResponse")
    public JAXBElement<PublicarOfertaResponse> createPublicarOfertaResponse(PublicarOfertaResponse value) {
        return new JAXBElement<PublicarOfertaResponse>(_PublicarOfertaResponse_QNAME, PublicarOfertaResponse.class, null, value);
    }

}
