
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

    private final static QName _CrearDetalleOferta_QNAME = new QName("http://Servicios/", "Crear_detalle_oferta");
    private final static QName _CrearDetalleOfertaResponse_QNAME = new QName("http://Servicios/", "Crear_detalle_ofertaResponse");
    private final static QName _EliminarDetalleOferta_QNAME = new QName("http://Servicios/", "Eliminar_detalle_oferta");
    private final static QName _EliminarDetalleOfertaResponse_QNAME = new QName("http://Servicios/", "Eliminar_detalle_ofertaResponse");
    private final static QName _ListadoDetalleOferta_QNAME = new QName("http://Servicios/", "Listado_detalle_oferta");
    private final static QName _ListadoDetalleOfertaResponse_QNAME = new QName("http://Servicios/", "Listado_detalle_ofertaResponse");
    private final static QName _Categoria_QNAME = new QName("http://Servicios/", "categoria");
    private final static QName _DetalleOferta_QNAME = new QName("http://Servicios/", "detalleOferta");
    private final static QName _Estado_QNAME = new QName("http://Servicios/", "estado");
    private final static QName _Oferta_QNAME = new QName("http://Servicios/", "oferta");
    private final static QName _Producto_QNAME = new QName("http://Servicios/", "producto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearDetalleOferta }
     * 
     */
    public CrearDetalleOferta createCrearDetalleOferta() {
        return new CrearDetalleOferta();
    }

    /**
     * Create an instance of {@link CrearDetalleOfertaResponse }
     * 
     */
    public CrearDetalleOfertaResponse createCrearDetalleOfertaResponse() {
        return new CrearDetalleOfertaResponse();
    }

    /**
     * Create an instance of {@link EliminarDetalleOferta }
     * 
     */
    public EliminarDetalleOferta createEliminarDetalleOferta() {
        return new EliminarDetalleOferta();
    }

    /**
     * Create an instance of {@link EliminarDetalleOfertaResponse }
     * 
     */
    public EliminarDetalleOfertaResponse createEliminarDetalleOfertaResponse() {
        return new EliminarDetalleOfertaResponse();
    }

    /**
     * Create an instance of {@link ListadoDetalleOferta }
     * 
     */
    public ListadoDetalleOferta createListadoDetalleOferta() {
        return new ListadoDetalleOferta();
    }

    /**
     * Create an instance of {@link ListadoDetalleOfertaResponse }
     * 
     */
    public ListadoDetalleOfertaResponse createListadoDetalleOfertaResponse() {
        return new ListadoDetalleOfertaResponse();
    }

    /**
     * Create an instance of {@link Categoria }
     * 
     */
    public Categoria createCategoria() {
        return new Categoria();
    }

    /**
     * Create an instance of {@link DetalleOferta }
     * 
     */
    public DetalleOferta createDetalleOferta() {
        return new DetalleOferta();
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
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link DetalleOfertaPK }
     * 
     */
    public DetalleOfertaPK createDetalleOfertaPK() {
        return new DetalleOfertaPK();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearDetalleOferta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_detalle_oferta")
    public JAXBElement<CrearDetalleOferta> createCrearDetalleOferta(CrearDetalleOferta value) {
        return new JAXBElement<CrearDetalleOferta>(_CrearDetalleOferta_QNAME, CrearDetalleOferta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearDetalleOfertaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_detalle_ofertaResponse")
    public JAXBElement<CrearDetalleOfertaResponse> createCrearDetalleOfertaResponse(CrearDetalleOfertaResponse value) {
        return new JAXBElement<CrearDetalleOfertaResponse>(_CrearDetalleOfertaResponse_QNAME, CrearDetalleOfertaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDetalleOferta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_detalle_oferta")
    public JAXBElement<EliminarDetalleOferta> createEliminarDetalleOferta(EliminarDetalleOferta value) {
        return new JAXBElement<EliminarDetalleOferta>(_EliminarDetalleOferta_QNAME, EliminarDetalleOferta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarDetalleOfertaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_detalle_ofertaResponse")
    public JAXBElement<EliminarDetalleOfertaResponse> createEliminarDetalleOfertaResponse(EliminarDetalleOfertaResponse value) {
        return new JAXBElement<EliminarDetalleOfertaResponse>(_EliminarDetalleOfertaResponse_QNAME, EliminarDetalleOfertaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoDetalleOferta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_detalle_oferta")
    public JAXBElement<ListadoDetalleOferta> createListadoDetalleOferta(ListadoDetalleOferta value) {
        return new JAXBElement<ListadoDetalleOferta>(_ListadoDetalleOferta_QNAME, ListadoDetalleOferta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoDetalleOfertaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_detalle_ofertaResponse")
    public JAXBElement<ListadoDetalleOfertaResponse> createListadoDetalleOfertaResponse(ListadoDetalleOfertaResponse value) {
        return new JAXBElement<ListadoDetalleOfertaResponse>(_ListadoDetalleOfertaResponse_QNAME, ListadoDetalleOfertaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Categoria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "categoria")
    public JAXBElement<Categoria> createCategoria(Categoria value) {
        return new JAXBElement<Categoria>(_Categoria_QNAME, Categoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleOferta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "detalleOferta")
    public JAXBElement<DetalleOferta> createDetalleOferta(DetalleOferta value) {
        return new JAXBElement<DetalleOferta>(_DetalleOferta_QNAME, DetalleOferta.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "producto")
    public JAXBElement<Producto> createProducto(Producto value) {
        return new JAXBElement<Producto>(_Producto_QNAME, Producto.class, null, value);
    }

}
