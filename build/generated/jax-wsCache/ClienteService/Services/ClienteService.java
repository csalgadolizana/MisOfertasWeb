
package Services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClienteService", targetNamespace = "http://Servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClienteService {


    /**
     * 
     * @return
     *     returns java.util.List<Services.Cliente>
     */
    @WebMethod(operationName = "Listado_clientes")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Listado_clientes", targetNamespace = "http://Servicios/", className = "Services.ListadoClientes")
    @ResponseWrapper(localName = "Listado_clientesResponse", targetNamespace = "http://Servicios/", className = "Services.ListadoClientesResponse")
    @Action(input = "http://Servicios/ClienteService/Listado_clientesRequest", output = "http://Servicios/ClienteService/Listado_clientesResponse")
    public List<Cliente> listadoClientes();

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Eliminar_cliente")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Eliminar_cliente", targetNamespace = "http://Servicios/", className = "Services.EliminarCliente")
    @ResponseWrapper(localName = "Eliminar_clienteResponse", targetNamespace = "http://Servicios/", className = "Services.EliminarClienteResponse")
    @Action(input = "http://Servicios/ClienteService/Eliminar_clienteRequest", output = "http://Servicios/ClienteService/Eliminar_clienteResponse")
    public String eliminarCliente(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param correo
     * @param contrasena
     * @return
     *     returns Services.Cliente
     */
    @WebMethod(operationName = "Autenticacion")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Autenticacion", targetNamespace = "http://Servicios/", className = "Services.Autenticacion")
    @ResponseWrapper(localName = "AutenticacionResponse", targetNamespace = "http://Servicios/", className = "Services.AutenticacionResponse")
    @Action(input = "http://Servicios/ClienteService/AutenticacionRequest", output = "http://Servicios/ClienteService/AutenticacionResponse")
    public Cliente autenticacion(
        @WebParam(name = "correo", targetNamespace = "")
        String correo,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena);

    /**
     * 
     * @param aceptaInformativo
     * @param password
     * @param idEstado
     * @param fechaNacimiento
     * @param fechaInicio
     * @param correo
     * @param fechaActualizacion
     * @param id
     * @param telefono
     * @param idCiudad
     * @param idPersona
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Crear_cliente")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Crear_cliente", targetNamespace = "http://Servicios/", className = "Services.CrearCliente")
    @ResponseWrapper(localName = "Crear_clienteResponse", targetNamespace = "http://Servicios/", className = "Services.CrearClienteResponse")
    @Action(input = "http://Servicios/ClienteService/Crear_clienteRequest", output = "http://Servicios/ClienteService/Crear_clienteResponse")
    public String crearCliente(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "fecha_nacimiento", targetNamespace = "")
        XMLGregorianCalendar fechaNacimiento,
        @WebParam(name = "correo", targetNamespace = "")
        String correo,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "telefono", targetNamespace = "")
        int telefono,
        @WebParam(name = "acepta_informativo", targetNamespace = "")
        String aceptaInformativo,
        @WebParam(name = "fecha_inicio", targetNamespace = "")
        XMLGregorianCalendar fechaInicio,
        @WebParam(name = "fecha_actualizacion", targetNamespace = "")
        XMLGregorianCalendar fechaActualizacion,
        @WebParam(name = "id_ciudad", targetNamespace = "")
        int idCiudad,
        @WebParam(name = "id_estado", targetNamespace = "")
        int idEstado,
        @WebParam(name = "id_persona", targetNamespace = "")
        int idPersona);

    /**
     * 
     * @param aceptaInformativo
     * @param password
     * @param idEstado
     * @param fechaNacimiento
     * @param fechaInicio
     * @param correo
     * @param fechaActualizacion
     * @param id
     * @param telefono
     * @param idCiudad
     * @param idPersona
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Modificar_cliente")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Modificar_cliente", targetNamespace = "http://Servicios/", className = "Services.ModificarCliente")
    @ResponseWrapper(localName = "Modificar_clienteResponse", targetNamespace = "http://Servicios/", className = "Services.ModificarClienteResponse")
    @Action(input = "http://Servicios/ClienteService/Modificar_clienteRequest", output = "http://Servicios/ClienteService/Modificar_clienteResponse")
    public String modificarCliente(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "fecha_nacimiento", targetNamespace = "")
        XMLGregorianCalendar fechaNacimiento,
        @WebParam(name = "correo", targetNamespace = "")
        String correo,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "telefono", targetNamespace = "")
        int telefono,
        @WebParam(name = "acepta_informativo", targetNamespace = "")
        String aceptaInformativo,
        @WebParam(name = "fecha_inicio", targetNamespace = "")
        XMLGregorianCalendar fechaInicio,
        @WebParam(name = "fecha_actualizacion", targetNamespace = "")
        XMLGregorianCalendar fechaActualizacion,
        @WebParam(name = "id_ciudad", targetNamespace = "")
        int idCiudad,
        @WebParam(name = "id_estado", targetNamespace = "")
        int idEstado,
        @WebParam(name = "id_persona", targetNamespace = "")
        int idPersona);

}
