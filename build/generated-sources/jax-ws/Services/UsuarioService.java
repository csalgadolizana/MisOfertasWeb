
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
@WebService(name = "UsuarioService", targetNamespace = "http://Servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UsuarioService {


    /**
     * 
     * @param correo
     * @param contrasena
     * @return
     *     returns Services.Usuario
     */
    @WebMethod(operationName = "AutenticarTrabajador")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AutenticarTrabajador", targetNamespace = "http://Servicios/", className = "Services.AutenticarTrabajador")
    @ResponseWrapper(localName = "AutenticarTrabajadorResponse", targetNamespace = "http://Servicios/", className = "Services.AutenticarTrabajadorResponse")
    @Action(input = "http://Servicios/UsuarioService/AutenticarTrabajadorRequest", output = "http://Servicios/UsuarioService/AutenticarTrabajadorResponse")
    public Usuario autenticarTrabajador(
        @WebParam(name = "correo", targetNamespace = "")
        String correo,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena);

    /**
     * 
     * @param correo
     * @param contrasena
     * @return
     *     returns java.lang.Object
     */
    @WebMethod(operationName = "Autenticacion")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Autenticacion", targetNamespace = "http://Servicios/", className = "Services.Autenticacion")
    @ResponseWrapper(localName = "AutenticacionResponse", targetNamespace = "http://Servicios/", className = "Services.AutenticacionResponse")
    @Action(input = "http://Servicios/UsuarioService/AutenticacionRequest", output = "http://Servicios/UsuarioService/AutenticacionResponse")
    public Object autenticacion(
        @WebParam(name = "correo", targetNamespace = "")
        String correo,
        @WebParam(name = "contrasena", targetNamespace = "")
        String contrasena);

    /**
     * 
     * @return
     *     returns java.util.List<Services.Usuario>
     */
    @WebMethod(operationName = "Listado_usuarios")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Listado_usuarios", targetNamespace = "http://Servicios/", className = "Services.ListadoUsuarios")
    @ResponseWrapper(localName = "Listado_usuariosResponse", targetNamespace = "http://Servicios/", className = "Services.ListadoUsuariosResponse")
    @Action(input = "http://Servicios/UsuarioService/Listado_usuariosRequest", output = "http://Servicios/UsuarioService/Listado_usuariosResponse")
    public List<Usuario> listadoUsuarios();

    /**
     * 
     * @param password
     * @param fechaInicio
     * @param correo
     * @param fechaActualizacion
     * @param id
     * @param telefono
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Modificar_USUARIO")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Modificar_USUARIO", targetNamespace = "http://Servicios/", className = "Services.ModificarUSUARIO")
    @ResponseWrapper(localName = "Modificar_USUARIOResponse", targetNamespace = "http://Servicios/", className = "Services.ModificarUSUARIOResponse")
    @Action(input = "http://Servicios/UsuarioService/Modificar_USUARIORequest", output = "http://Servicios/UsuarioService/Modificar_USUARIOResponse")
    public String modificarUSUARIO(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "correo", targetNamespace = "")
        String correo,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "telefono", targetNamespace = "")
        int telefono,
        @WebParam(name = "fecha_inicio", targetNamespace = "")
        XMLGregorianCalendar fechaInicio,
        @WebParam(name = "fecha_actualizacion", targetNamespace = "")
        XMLGregorianCalendar fechaActualizacion);

    /**
     * 
     * @param idCargo
     * @param password
     * @param idEstado
     * @param fechaInicio
     * @param correo
     * @param fechaActualizacion
     * @param id
     * @param telefono
     * @param idPersona
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CREAR_USUARIO")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CREAR_USUARIO", targetNamespace = "http://Servicios/", className = "Services.CREARUSUARIO")
    @ResponseWrapper(localName = "CREAR_USUARIOResponse", targetNamespace = "http://Servicios/", className = "Services.CREARUSUARIOResponse")
    @Action(input = "http://Servicios/UsuarioService/CREAR_USUARIORequest", output = "http://Servicios/UsuarioService/CREAR_USUARIOResponse")
    public String crearUSUARIO(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "correo", targetNamespace = "")
        String correo,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "telefono", targetNamespace = "")
        int telefono,
        @WebParam(name = "fecha_inicio", targetNamespace = "")
        XMLGregorianCalendar fechaInicio,
        @WebParam(name = "fecha_actualizacion", targetNamespace = "")
        XMLGregorianCalendar fechaActualizacion,
        @WebParam(name = "id_estado", targetNamespace = "")
        int idEstado,
        @WebParam(name = "id_persona", targetNamespace = "")
        int idPersona,
        @WebParam(name = "id_cargo", targetNamespace = "")
        int idCargo);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Eliminar_usuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Eliminar_usuario", targetNamespace = "http://Servicios/", className = "Services.EliminarUsuario")
    @ResponseWrapper(localName = "Eliminar_usuarioResponse", targetNamespace = "http://Servicios/", className = "Services.EliminarUsuarioResponse")
    @Action(input = "http://Servicios/UsuarioService/Eliminar_usuarioRequest", output = "http://Servicios/UsuarioService/Eliminar_usuarioResponse")
    public String eliminarUsuario(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}
