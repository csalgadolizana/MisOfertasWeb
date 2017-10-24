
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

    private final static QName _CrearCategoria_QNAME = new QName("http://Servicios/", "Crear_categoria");
    private final static QName _CrearCategoriaResponse_QNAME = new QName("http://Servicios/", "Crear_categoriaResponse");
    private final static QName _EliminarCategoria_QNAME = new QName("http://Servicios/", "Eliminar_categoria");
    private final static QName _EliminarCategoriaResponse_QNAME = new QName("http://Servicios/", "Eliminar_categoriaResponse");
    private final static QName _ListadoCategorias_QNAME = new QName("http://Servicios/", "Listado_categorias");
    private final static QName _ListadoCategoriasResponse_QNAME = new QName("http://Servicios/", "Listado_categoriasResponse");
    private final static QName _ModificarCategoria_QNAME = new QName("http://Servicios/", "Modificar_categoria");
    private final static QName _ModificarCategoriaResponse_QNAME = new QName("http://Servicios/", "Modificar_categoriaResponse");
    private final static QName _Categoria_QNAME = new QName("http://Servicios/", "categoria");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearCategoria }
     * 
     */
    public CrearCategoria createCrearCategoria() {
        return new CrearCategoria();
    }

    /**
     * Create an instance of {@link CrearCategoriaResponse }
     * 
     */
    public CrearCategoriaResponse createCrearCategoriaResponse() {
        return new CrearCategoriaResponse();
    }

    /**
     * Create an instance of {@link EliminarCategoria }
     * 
     */
    public EliminarCategoria createEliminarCategoria() {
        return new EliminarCategoria();
    }

    /**
     * Create an instance of {@link EliminarCategoriaResponse }
     * 
     */
    public EliminarCategoriaResponse createEliminarCategoriaResponse() {
        return new EliminarCategoriaResponse();
    }

    /**
     * Create an instance of {@link ListadoCategorias }
     * 
     */
    public ListadoCategorias createListadoCategorias() {
        return new ListadoCategorias();
    }

    /**
     * Create an instance of {@link ListadoCategoriasResponse }
     * 
     */
    public ListadoCategoriasResponse createListadoCategoriasResponse() {
        return new ListadoCategoriasResponse();
    }

    /**
     * Create an instance of {@link ModificarCategoria }
     * 
     */
    public ModificarCategoria createModificarCategoria() {
        return new ModificarCategoria();
    }

    /**
     * Create an instance of {@link ModificarCategoriaResponse }
     * 
     */
    public ModificarCategoriaResponse createModificarCategoriaResponse() {
        return new ModificarCategoriaResponse();
    }

    /**
     * Create an instance of {@link Categoria }
     * 
     */
    public Categoria createCategoria() {
        return new Categoria();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCategoria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_categoria")
    public JAXBElement<CrearCategoria> createCrearCategoria(CrearCategoria value) {
        return new JAXBElement<CrearCategoria>(_CrearCategoria_QNAME, CrearCategoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCategoriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_categoriaResponse")
    public JAXBElement<CrearCategoriaResponse> createCrearCategoriaResponse(CrearCategoriaResponse value) {
        return new JAXBElement<CrearCategoriaResponse>(_CrearCategoriaResponse_QNAME, CrearCategoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCategoria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_categoria")
    public JAXBElement<EliminarCategoria> createEliminarCategoria(EliminarCategoria value) {
        return new JAXBElement<EliminarCategoria>(_EliminarCategoria_QNAME, EliminarCategoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCategoriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_categoriaResponse")
    public JAXBElement<EliminarCategoriaResponse> createEliminarCategoriaResponse(EliminarCategoriaResponse value) {
        return new JAXBElement<EliminarCategoriaResponse>(_EliminarCategoriaResponse_QNAME, EliminarCategoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoCategorias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_categorias")
    public JAXBElement<ListadoCategorias> createListadoCategorias(ListadoCategorias value) {
        return new JAXBElement<ListadoCategorias>(_ListadoCategorias_QNAME, ListadoCategorias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoCategoriasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_categoriasResponse")
    public JAXBElement<ListadoCategoriasResponse> createListadoCategoriasResponse(ListadoCategoriasResponse value) {
        return new JAXBElement<ListadoCategoriasResponse>(_ListadoCategoriasResponse_QNAME, ListadoCategoriasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarCategoria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_categoria")
    public JAXBElement<ModificarCategoria> createModificarCategoria(ModificarCategoria value) {
        return new JAXBElement<ModificarCategoria>(_ModificarCategoria_QNAME, ModificarCategoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarCategoriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_categoriaResponse")
    public JAXBElement<ModificarCategoriaResponse> createModificarCategoriaResponse(ModificarCategoriaResponse value) {
        return new JAXBElement<ModificarCategoriaResponse>(_ModificarCategoriaResponse_QNAME, ModificarCategoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Categoria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "categoria")
    public JAXBElement<Categoria> createCategoria(Categoria value) {
        return new JAXBElement<Categoria>(_Categoria_QNAME, Categoria.class, null, value);
    }

}
