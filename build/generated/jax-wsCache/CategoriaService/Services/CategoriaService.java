
package Services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CategoriaService", targetNamespace = "http://Servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CategoriaService {


    /**
     * 
     * @param id
     * @param desc
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Modificar_categoria")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Modificar_categoria", targetNamespace = "http://Servicios/", className = "Services.ModificarCategoria")
    @ResponseWrapper(localName = "Modificar_categoriaResponse", targetNamespace = "http://Servicios/", className = "Services.ModificarCategoriaResponse")
    @Action(input = "http://Servicios/CategoriaService/Modificar_categoriaRequest", output = "http://Servicios/CategoriaService/Modificar_categoriaResponse")
    public String modificarCategoria(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "desc", targetNamespace = "")
        String desc);

    /**
     * 
     * @param id
     * @param desc
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Crear_categoria")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Crear_categoria", targetNamespace = "http://Servicios/", className = "Services.CrearCategoria")
    @ResponseWrapper(localName = "Crear_categoriaResponse", targetNamespace = "http://Servicios/", className = "Services.CrearCategoriaResponse")
    @Action(input = "http://Servicios/CategoriaService/Crear_categoriaRequest", output = "http://Servicios/CategoriaService/Crear_categoriaResponse")
    public String crearCategoria(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "desc", targetNamespace = "")
        String desc);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Eliminar_categoria")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Eliminar_categoria", targetNamespace = "http://Servicios/", className = "Services.EliminarCategoria")
    @ResponseWrapper(localName = "Eliminar_categoriaResponse", targetNamespace = "http://Servicios/", className = "Services.EliminarCategoriaResponse")
    @Action(input = "http://Servicios/CategoriaService/Eliminar_categoriaRequest", output = "http://Servicios/CategoriaService/Eliminar_categoriaResponse")
    public String eliminarCategoria(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @return
     *     returns java.util.List<Services.Categoria>
     */
    @WebMethod(operationName = "Listado_categorias")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Listado_categorias", targetNamespace = "http://Servicios/", className = "Services.ListadoCategorias")
    @ResponseWrapper(localName = "Listado_categoriasResponse", targetNamespace = "http://Servicios/", className = "Services.ListadoCategoriasResponse")
    @Action(input = "http://Servicios/CategoriaService/Listado_categoriasRequest", output = "http://Servicios/CategoriaService/Listado_categoriasResponse")
    public List<Categoria> listadoCategorias();

}