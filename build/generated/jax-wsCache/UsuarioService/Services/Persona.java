
package Services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para persona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="persona"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idpersona" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexoIdSexo" type="{http://Servicios/}sexo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persona", propOrder = {
    "apellidos",
    "idpersona",
    "nombre",
    "rut",
    "sexoIdSexo"
})
public class Persona {

    protected String apellidos;
    protected BigDecimal idpersona;
    protected String nombre;
    protected String rut;
    protected Sexo sexoIdSexo;

    /**
     * Obtiene el valor de la propiedad apellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Define el valor de la propiedad apellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad idpersona.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdpersona() {
        return idpersona;
    }

    /**
     * Define el valor de la propiedad idpersona.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdpersona(BigDecimal value) {
        this.idpersona = value;
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

    /**
     * Obtiene el valor de la propiedad rut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRut() {
        return rut;
    }

    /**
     * Define el valor de la propiedad rut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRut(String value) {
        this.rut = value;
    }

    /**
     * Obtiene el valor de la propiedad sexoIdSexo.
     * 
     * @return
     *     possible object is
     *     {@link Sexo }
     *     
     */
    public Sexo getSexoIdSexo() {
        return sexoIdSexo;
    }

    /**
     * Define el valor de la propiedad sexoIdSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link Sexo }
     *     
     */
    public void setSexoIdSexo(Sexo value) {
        this.sexoIdSexo = value;
    }

}
