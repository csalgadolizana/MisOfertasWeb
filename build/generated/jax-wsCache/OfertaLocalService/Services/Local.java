
package Services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para local complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="local"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ciudadIdCiudad" type="{http://Servicios/}ciudad" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="empresaIdEmpresa" type="{http://Servicios/}empresa" minOccurs="0"/&gt;
 *         &lt;element name="idLocal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "local", propOrder = {
    "ciudadIdCiudad",
    "direccion",
    "empresaIdEmpresa",
    "idLocal",
    "nombre"
})
public class Local {

    protected Ciudad ciudadIdCiudad;
    protected String direccion;
    protected Empresa empresaIdEmpresa;
    protected BigDecimal idLocal;
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad ciudadIdCiudad.
     * 
     * @return
     *     possible object is
     *     {@link Ciudad }
     *     
     */
    public Ciudad getCiudadIdCiudad() {
        return ciudadIdCiudad;
    }

    /**
     * Define el valor de la propiedad ciudadIdCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link Ciudad }
     *     
     */
    public void setCiudadIdCiudad(Ciudad value) {
        this.ciudadIdCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad empresaIdEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link Empresa }
     *     
     */
    public Empresa getEmpresaIdEmpresa() {
        return empresaIdEmpresa;
    }

    /**
     * Define el valor de la propiedad empresaIdEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link Empresa }
     *     
     */
    public void setEmpresaIdEmpresa(Empresa value) {
        this.empresaIdEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad idLocal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdLocal() {
        return idLocal;
    }

    /**
     * Define el valor de la propiedad idLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdLocal(BigDecimal value) {
        this.idLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

}
