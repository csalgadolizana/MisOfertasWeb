
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

    private final static QName _CrearPersona_QNAME = new QName("http://Servicios/", "Crear_persona");
    private final static QName _CrearPersonaResponse_QNAME = new QName("http://Servicios/", "Crear_personaResponse");
    private final static QName _EliminarPersona_QNAME = new QName("http://Servicios/", "Eliminar_persona");
    private final static QName _EliminarPersonaResponse_QNAME = new QName("http://Servicios/", "Eliminar_personaResponse");
    private final static QName _ListadoPersonas_QNAME = new QName("http://Servicios/", "Listado_personas");
    private final static QName _ListadoPersonasResponse_QNAME = new QName("http://Servicios/", "Listado_personasResponse");
    private final static QName _ModificarPersona_QNAME = new QName("http://Servicios/", "Modificar_persona");
    private final static QName _ModificarPersonaResponse_QNAME = new QName("http://Servicios/", "Modificar_personaResponse");
    private final static QName _Persona_QNAME = new QName("http://Servicios/", "persona");
    private final static QName _Sexo_QNAME = new QName("http://Servicios/", "sexo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearPersona }
     * 
     */
    public CrearPersona createCrearPersona() {
        return new CrearPersona();
    }

    /**
     * Create an instance of {@link CrearPersonaResponse }
     * 
     */
    public CrearPersonaResponse createCrearPersonaResponse() {
        return new CrearPersonaResponse();
    }

    /**
     * Create an instance of {@link EliminarPersona }
     * 
     */
    public EliminarPersona createEliminarPersona() {
        return new EliminarPersona();
    }

    /**
     * Create an instance of {@link EliminarPersonaResponse }
     * 
     */
    public EliminarPersonaResponse createEliminarPersonaResponse() {
        return new EliminarPersonaResponse();
    }

    /**
     * Create an instance of {@link ListadoPersonas }
     * 
     */
    public ListadoPersonas createListadoPersonas() {
        return new ListadoPersonas();
    }

    /**
     * Create an instance of {@link ListadoPersonasResponse }
     * 
     */
    public ListadoPersonasResponse createListadoPersonasResponse() {
        return new ListadoPersonasResponse();
    }

    /**
     * Create an instance of {@link ModificarPersona }
     * 
     */
    public ModificarPersona createModificarPersona() {
        return new ModificarPersona();
    }

    /**
     * Create an instance of {@link ModificarPersonaResponse }
     * 
     */
    public ModificarPersonaResponse createModificarPersonaResponse() {
        return new ModificarPersonaResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_persona")
    public JAXBElement<CrearPersona> createCrearPersona(CrearPersona value) {
        return new JAXBElement<CrearPersona>(_CrearPersona_QNAME, CrearPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Crear_personaResponse")
    public JAXBElement<CrearPersonaResponse> createCrearPersonaResponse(CrearPersonaResponse value) {
        return new JAXBElement<CrearPersonaResponse>(_CrearPersonaResponse_QNAME, CrearPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_persona")
    public JAXBElement<EliminarPersona> createEliminarPersona(EliminarPersona value) {
        return new JAXBElement<EliminarPersona>(_EliminarPersona_QNAME, EliminarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Eliminar_personaResponse")
    public JAXBElement<EliminarPersonaResponse> createEliminarPersonaResponse(EliminarPersonaResponse value) {
        return new JAXBElement<EliminarPersonaResponse>(_EliminarPersonaResponse_QNAME, EliminarPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoPersonas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_personas")
    public JAXBElement<ListadoPersonas> createListadoPersonas(ListadoPersonas value) {
        return new JAXBElement<ListadoPersonas>(_ListadoPersonas_QNAME, ListadoPersonas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoPersonasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Listado_personasResponse")
    public JAXBElement<ListadoPersonasResponse> createListadoPersonasResponse(ListadoPersonasResponse value) {
        return new JAXBElement<ListadoPersonasResponse>(_ListadoPersonasResponse_QNAME, ListadoPersonasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_persona")
    public JAXBElement<ModificarPersona> createModificarPersona(ModificarPersona value) {
        return new JAXBElement<ModificarPersona>(_ModificarPersona_QNAME, ModificarPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicios/", name = "Modificar_personaResponse")
    public JAXBElement<ModificarPersonaResponse> createModificarPersonaResponse(ModificarPersonaResponse value) {
        return new JAXBElement<ModificarPersonaResponse>(_ModificarPersonaResponse_QNAME, ModificarPersonaResponse.class, null, value);
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

}
