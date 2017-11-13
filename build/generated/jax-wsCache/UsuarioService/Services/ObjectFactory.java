
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

    private final static QName _Autenticacion_QNAME = new QName("http://Servicios/", "Autenticacion");
    private final static QName _AutenticacionResponse_QNAME = new QName("http://Servicios/", "AutenticacionResponse");
    private final static QName _AutenticarTrabajador_QNAME = new QName("http://Servicios/", "AutenticarTrabajador");
    private final static QName _AutenticarTrabajadorResponse_QNAME = new QName("http://Servicios/", "AutenticarTrabajadorResponse");
    private final static QName _CREARUSUARIO_QNAME = new QName("http://Servicios/", "CREAR_USUARIO");
    private final static QName _CREARUSUARIOResponse_QNAME = new QName("http://Servicios/", "CREAR_USUARIOResponse");
    private final static QName _EliminarUsuario_QNAME = new QName("http://Servicios/", "Eliminar_usuario");
    private final static QName _EliminarUsuarioResponse_QNAME = new QName("http://Servicios/", "Eliminar_usuarioResponse");
    private final static QName _ListadoUsuarios_QNAME = new QName("http://Servicios/", "Listado_usuarios");
    private final static QName _ListadoUsuariosResponse_QNAME = new QName("http://Servicios/", "Listado_usuariosResponse");
    private final static QName _ModificarUSUARIO_QNAME = new QName("http://Servicios/", "Modificar_USUARIO");
    private final static QName _ModificarUSUARIOResponse_QNAME = new QName("http://Servicios/", "Modificar_USUARIOResponse");
    private final static QName _Cargo_QNAME = new QName("http://Servicios/", "cargo");
    private final static QName _Estado_QNAME = new QName("http://Servicios/", "estado");
    private final static QName _Persona_QNAME = new QName("http://Servicios/", "persona");
    private final static QName _Sexo_QNAME = new QName("http://Servicios/", "sexo");
    private final static QName _Usuario_QNAME = new QName("http://Servicios/", "usuario");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Services
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
     * Create an instance of {@link AutenticarTrabajador }
     * 
     */
    public AutenticarTrabajador createAutenticarTrabajador() {
        return new AutenticarTrabajador();
    }

    /**
     * Create an instance of {@link AutenticarTrabajadorResponse }
     * 
     */
    public AutenticarTrabajadorResponse createAutenticarTrabajadorResponse() {
        return new AutenticarTrabajadorResponse();
    }

    /**
     * Create an instance of {@link CREARUSUARIO }
     * 
     */
    public CREARUSUARIO createCREARUSUARIO() {
        return new CREARUSUARIO();
    }

    /**
     * Create an instance of {@link CREARUSUARIOResponse }
     * 
     */
    public CREARUSUARIOResponse createCREARUSUARIOResponse() {
        return new CREARUSUARIOResponse();
    }

    /**
     * Create an instance of {@link EliminarUsuario }
     * 
     */
    public EliminarUsuario createEliminarUsuario() {
        return new EliminarUsuario();
    }

    /**
     * Create an instance of {@link EliminarUsuarioResponse }
     * 
     */
    public EliminarUsuarioResponse createEliminarUsuarioResponse() {
        return new EliminarUsuarioResponse();
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
     * Create an instance of {@link ModificarUSUARIO }
     * 
     */
    public ModificarUSUARIO createModificarUSUARIO() {
        return new ModificarUSUARIO();
    }

    /**
     * Create an instance of {@link ModificarUSUARIOResponse }
     * 
     */
    public ModificarUSUARIOResponse createModificarUSUARIOResponse() {
        return new ModificarUSUARIOResponse();
    }

    /**
     * Create an instance of {@link Cargo }
     * 
     */
    public Cargo createCargo() {
        return new Cargo();
    }

    /**
     * Create an instance of {@link Estado }
     * 
     */
    public Estado createEstado() {
        return new Estado();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Sexo }
     * 
     */
    public Sexo createSexo() {
        return new Sexo();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarTrabajador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "AutenticarTrabajador")
    public JAXBElement<AutenticarTrabajador> createAutenticarTrabajador(AutenticarTrabajador value) {
        return new JAXBElement<AutenticarTrabajador>(_AutenticarTrabajador_QNAME, AutenticarTrabajador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarTrabajadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "AutenticarTrabajadorResponse")
    public JAXBElement<AutenticarTrabajadorResponse> createAutenticarTrabajadorResponse(AutenticarTrabajadorResponse value) {
        return new JAXBElement<AutenticarTrabajadorResponse>(_AutenticarTrabajadorResponse_QNAME, AutenticarTrabajadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CREARUSUARIO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "CREAR_USUARIO")
    public JAXBElement<CREARUSUARIO> createCREARUSUARIO(CREARUSUARIO value) {
        return new JAXBElement<CREARUSUARIO>(_CREARUSUARIO_QNAME, CREARUSUARIO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CREARUSUARIOResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "CREAR_USUARIOResponse")
    public JAXBElement<CREARUSUARIOResponse> createCREARUSUARIOResponse(CREARUSUARIOResponse value) {
        return new JAXBElement<CREARUSUARIOResponse>(_CREARUSUARIOResponse_QNAME, CREARUSUARIOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_usuario")
    public JAXBElement<EliminarUsuario> createEliminarUsuario(EliminarUsuario value) {
        return new JAXBElement<EliminarUsuario>(_EliminarUsuario_QNAME, EliminarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_usuarioResponse")
    public JAXBElement<EliminarUsuarioResponse> createEliminarUsuarioResponse(EliminarUsuarioResponse value) {
        return new JAXBElement<EliminarUsuarioResponse>(_EliminarUsuarioResponse_QNAME, EliminarUsuarioResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarUSUARIO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_USUARIO")
    public JAXBElement<ModificarUSUARIO> createModificarUSUARIO(ModificarUSUARIO value) {
        return new JAXBElement<ModificarUSUARIO>(_ModificarUSUARIO_QNAME, ModificarUSUARIO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarUSUARIOResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_USUARIOResponse")
    public JAXBElement<ModificarUSUARIOResponse> createModificarUSUARIOResponse(ModificarUSUARIOResponse value) {
        return new JAXBElement<ModificarUSUARIOResponse>(_ModificarUSUARIOResponse_QNAME, ModificarUSUARIOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cargo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "cargo")
    public JAXBElement<Cargo> createCargo(Cargo value) {
        return new JAXBElement<Cargo>(_Cargo_QNAME, Cargo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "persona")
    public JAXBElement<Persona> createPersona(Persona value) {
        return new JAXBElement<Persona>(_Persona_QNAME, Persona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sexo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "sexo")
    public JAXBElement<Sexo> createSexo(Sexo value) {
        return new JAXBElement<Sexo>(_Sexo_QNAME, Sexo.class, null, value);
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
