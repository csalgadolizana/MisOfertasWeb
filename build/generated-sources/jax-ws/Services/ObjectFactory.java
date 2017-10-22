
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
    private final static QName _CrearCliente_QNAME = new QName("http://Servicios/", "Crear_cliente");
    private final static QName _CrearClienteResponse_QNAME = new QName("http://Servicios/", "Crear_clienteResponse");
    private final static QName _EliminarCliente_QNAME = new QName("http://Servicios/", "Eliminar_cliente");
    private final static QName _EliminarClienteResponse_QNAME = new QName("http://Servicios/", "Eliminar_clienteResponse");
    private final static QName _ListadoClientes_QNAME = new QName("http://Servicios/", "Listado_clientes");
    private final static QName _ListadoClientesResponse_QNAME = new QName("http://Servicios/", "Listado_clientesResponse");
    private final static QName _ModificarCliente_QNAME = new QName("http://Servicios/", "Modificar_cliente");
    private final static QName _ModificarClienteResponse_QNAME = new QName("http://Servicios/", "Modificar_clienteResponse");
    private final static QName _Ciudad_QNAME = new QName("http://Servicios/", "ciudad");
    private final static QName _Cliente_QNAME = new QName("http://Servicios/", "cliente");
    private final static QName _Estado_QNAME = new QName("http://Servicios/", "estado");
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
     * Create an instance of {@link CrearCliente }
     * 
     */
    public CrearCliente createCrearCliente() {
        return new CrearCliente();
    }

    /**
     * Create an instance of {@link CrearClienteResponse }
     * 
     */
    public CrearClienteResponse createCrearClienteResponse() {
        return new CrearClienteResponse();
    }

    /**
     * Create an instance of {@link EliminarCliente }
     * 
     */
    public EliminarCliente createEliminarCliente() {
        return new EliminarCliente();
    }

    /**
     * Create an instance of {@link EliminarClienteResponse }
     * 
     */
    public EliminarClienteResponse createEliminarClienteResponse() {
        return new EliminarClienteResponse();
    }

    /**
     * Create an instance of {@link ListadoClientes }
     * 
     */
    public ListadoClientes createListadoClientes() {
        return new ListadoClientes();
    }

    /**
     * Create an instance of {@link ListadoClientesResponse }
     * 
     */
    public ListadoClientesResponse createListadoClientesResponse() {
        return new ListadoClientesResponse();
    }

    /**
     * Create an instance of {@link ModificarCliente }
     * 
     */
    public ModificarCliente createModificarCliente() {
        return new ModificarCliente();
    }

    /**
     * Create an instance of {@link ModificarClienteResponse }
     * 
     */
    public ModificarClienteResponse createModificarClienteResponse() {
        return new ModificarClienteResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_cliente")
    public JAXBElement<CrearCliente> createCrearCliente(CrearCliente value) {
        return new JAXBElement<CrearCliente>(_CrearCliente_QNAME, CrearCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_clienteResponse")
    public JAXBElement<CrearClienteResponse> createCrearClienteResponse(CrearClienteResponse value) {
        return new JAXBElement<CrearClienteResponse>(_CrearClienteResponse_QNAME, CrearClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_cliente")
    public JAXBElement<EliminarCliente> createEliminarCliente(EliminarCliente value) {
        return new JAXBElement<EliminarCliente>(_EliminarCliente_QNAME, EliminarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_clienteResponse")
    public JAXBElement<EliminarClienteResponse> createEliminarClienteResponse(EliminarClienteResponse value) {
        return new JAXBElement<EliminarClienteResponse>(_EliminarClienteResponse_QNAME, EliminarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoClientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_clientes")
    public JAXBElement<ListadoClientes> createListadoClientes(ListadoClientes value) {
        return new JAXBElement<ListadoClientes>(_ListadoClientes_QNAME, ListadoClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoClientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_clientesResponse")
    public JAXBElement<ListadoClientesResponse> createListadoClientesResponse(ListadoClientesResponse value) {
        return new JAXBElement<ListadoClientesResponse>(_ListadoClientesResponse_QNAME, ListadoClientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_cliente")
    public JAXBElement<ModificarCliente> createModificarCliente(ModificarCliente value) {
        return new JAXBElement<ModificarCliente>(_ModificarCliente_QNAME, ModificarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_clienteResponse")
    public JAXBElement<ModificarClienteResponse> createModificarClienteResponse(ModificarClienteResponse value) {
        return new JAXBElement<ModificarClienteResponse>(_ModificarClienteResponse_QNAME, ModificarClienteResponse.class, null, value);
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
