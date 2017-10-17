
package WSDL;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WSDL package. 
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

    private final static QName _Autenticacion_QNAME = new QName("http://Servicios/", "Autenticacion");
    private final static QName _AutenticacionResponse_QNAME = new QName("http://Servicios/", "AutenticacionResponse");
    private final static QName _ListadoUsuarios_QNAME = new QName("http://Servicios/", "Listado_usuarios");
    private final static QName _ListadoUsuariosResponse_QNAME = new QName("http://Servicios/", "Listado_usuariosResponse");
    private final static QName _Usuario_QNAME = new QName("http://Servicios/", "usuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WSDL
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Autenticacion }
     * 
     */
    public Autenticacion createAutenticacion() {
        return new Autenticacion();
    }

    /**
     * Create an instance of {@link AutenticacionResponse }
     * 
     */
    public AutenticacionResponse createAutenticacionResponse() {
        return new AutenticacionResponse();
    }

    /**
     * Create an instance of {@link ListadoUsuarios }
     * 
     */
    public ListadoUsuarios createListadoUsuarios() {
        return new ListadoUsuarios();
    }

    /**
     * Create an instance of {@link ListadoUsuariosResponse }
     * 
     */
    public ListadoUsuariosResponse createListadoUsuariosResponse() {
        return new ListadoUsuariosResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Autenticacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Autenticacion")
    public JAXBElement<Autenticacion> createAutenticacion(Autenticacion value) {
        return new JAXBElement<Autenticacion>(_Autenticacion_QNAME, Autenticacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "AutenticacionResponse")
    public JAXBElement<AutenticacionResponse> createAutenticacionResponse(AutenticacionResponse value) {
        return new JAXBElement<AutenticacionResponse>(_AutenticacionResponse_QNAME, AutenticacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_usuarios")
    public JAXBElement<ListadoUsuarios> createListadoUsuarios(ListadoUsuarios value) {
        return new JAXBElement<ListadoUsuarios>(_ListadoUsuarios_QNAME, ListadoUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_usuariosResponse")
    public JAXBElement<ListadoUsuariosResponse> createListadoUsuariosResponse(ListadoUsuariosResponse value) {
        return new JAXBElement<ListadoUsuariosResponse>(_ListadoUsuariosResponse_QNAME, ListadoUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "usuario")
    public JAXBElement<Usuario> createUsuario(Usuario value) {
        return new JAXBElement<Usuario>(_Usuario_QNAME, Usuario.class, null, value);
    }

}
