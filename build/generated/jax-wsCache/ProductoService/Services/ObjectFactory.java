
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

    private final static QName _CrearProducto_QNAME = new QName("http://Servicios/", "Crear_producto");
    private final static QName _CrearProductoResponse_QNAME = new QName("http://Servicios/", "Crear_productoResponse");
    private final static QName _EliminarProducto_QNAME = new QName("http://Servicios/", "Eliminar_producto");
    private final static QName _EliminarProductoResponse_QNAME = new QName("http://Servicios/", "Eliminar_productoResponse");
    private final static QName _ListadoProductos_QNAME = new QName("http://Servicios/", "Listado_productos");
    private final static QName _ListadoProductosResponse_QNAME = new QName("http://Servicios/", "Listado_productosResponse");
    private final static QName _ModificarProducto_QNAME = new QName("http://Servicios/", "Modificar_producto");
    private final static QName _ModificarProductoResponse_QNAME = new QName("http://Servicios/", "Modificar_productoResponse");
    private final static QName _Categoria_QNAME = new QName("http://Servicios/", "categoria");
    private final static QName _Producto_QNAME = new QName("http://Servicios/", "producto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearProducto }
     * 
     */
    public CrearProducto createCrearProducto() {
        return new CrearProducto();
    }

    /**
     * Create an instance of {@link CrearProductoResponse }
     * 
     */
    public CrearProductoResponse createCrearProductoResponse() {
        return new CrearProductoResponse();
    }

    /**
     * Create an instance of {@link EliminarProducto }
     * 
     */
    public EliminarProducto createEliminarProducto() {
        return new EliminarProducto();
    }

    /**
     * Create an instance of {@link EliminarProductoResponse }
     * 
     */
    public EliminarProductoResponse createEliminarProductoResponse() {
        return new EliminarProductoResponse();
    }

    /**
     * Create an instance of {@link ListadoProductos }
     * 
     */
    public ListadoProductos createListadoProductos() {
        return new ListadoProductos();
    }

    /**
     * Create an instance of {@link ListadoProductosResponse }
     * 
     */
    public ListadoProductosResponse createListadoProductosResponse() {
        return new ListadoProductosResponse();
    }

    /**
     * Create an instance of {@link ModificarProducto }
     * 
     */
    public ModificarProducto createModificarProducto() {
        return new ModificarProducto();
    }

    /**
     * Create an instance of {@link ModificarProductoResponse }
     * 
     */
    public ModificarProductoResponse createModificarProductoResponse() {
        return new ModificarProductoResponse();
    }

    /**
     * Create an instance of {@link Categoria }
     * 
     */
    public Categoria createCategoria() {
        return new Categoria();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_producto")
    public JAXBElement<CrearProducto> createCrearProducto(CrearProducto value) {
        return new JAXBElement<CrearProducto>(_CrearProducto_QNAME, CrearProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_productoResponse")
    public JAXBElement<CrearProductoResponse> createCrearProductoResponse(CrearProductoResponse value) {
        return new JAXBElement<CrearProductoResponse>(_CrearProductoResponse_QNAME, CrearProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_producto")
    public JAXBElement<EliminarProducto> createEliminarProducto(EliminarProducto value) {
        return new JAXBElement<EliminarProducto>(_EliminarProducto_QNAME, EliminarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_productoResponse")
    public JAXBElement<EliminarProductoResponse> createEliminarProductoResponse(EliminarProductoResponse value) {
        return new JAXBElement<EliminarProductoResponse>(_EliminarProductoResponse_QNAME, EliminarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_productos")
    public JAXBElement<ListadoProductos> createListadoProductos(ListadoProductos value) {
        return new JAXBElement<ListadoProductos>(_ListadoProductos_QNAME, ListadoProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_productosResponse")
    public JAXBElement<ListadoProductosResponse> createListadoProductosResponse(ListadoProductosResponse value) {
        return new JAXBElement<ListadoProductosResponse>(_ListadoProductosResponse_QNAME, ListadoProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_producto")
    public JAXBElement<ModificarProducto> createModificarProducto(ModificarProducto value) {
        return new JAXBElement<ModificarProducto>(_ModificarProducto_QNAME, ModificarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_productoResponse")
    public JAXBElement<ModificarProductoResponse> createModificarProductoResponse(ModificarProductoResponse value) {
        return new JAXBElement<ModificarProductoResponse>(_ModificarProductoResponse_QNAME, ModificarProductoResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "producto")
    public JAXBElement<Producto> createProducto(Producto value) {
        return new JAXBElement<Producto>(_Producto_QNAME, Producto.class, null, value);
    }

}
