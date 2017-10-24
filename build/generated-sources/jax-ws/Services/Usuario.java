
package Services;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actualizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="cargoIdcargo" type="{http://Servicios/}cargo" minOccurs="0"/&gt;
 *         &lt;element name="contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoIdEstado" type="{http://Servicios/}estado" minOccurs="0"/&gt;
 *         &lt;element name="fechacreado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="personaIdpersona" type="{http://Servicios/}persona" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "actualizacion",
    "cargoIdcargo",
    "contrasena",
    "correo",
    "estadoIdEstado",
    "fechacreado",
    "idUsuario",
    "personaIdpersona",
    "telefono"
})
public class Usuario {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualizacion;
    protected Cargo cargoIdcargo;
    protected String contrasena;
    protected String correo;
    protected Estado estadoIdEstado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechacreado;
    protected BigDecimal idUsuario;
    protected Persona personaIdpersona;
    protected BigInteger telefono;

    /**
     * Obtiene el valor de la propiedad actualizacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualizacion() {
        return actualizacion;
    }

    /**
     * Define el valor de la propiedad actualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualizacion(XMLGregorianCalendar value) {
        this.actualizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoIdcargo.
     * 
     * @return
     *     possible object is
     *     {@link Cargo }
     *     
     */
    public Cargo getCargoIdcargo() {
        return cargoIdcargo;
    }

    /**
     * Define el valor de la propiedad cargoIdcargo.
     * 
     * @param value
     *     allowed object is
     *     {@link Cargo }
     *     
     */
    public void setCargoIdcargo(Cargo value) {
        this.cargoIdcargo = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define el valor de la propiedad contrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena(String value) {
        this.contrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoIdEstado.
     * 
     * @return
     *     possible object is
     *     {@link Estado }
     *     
     */
    public Estado getEstadoIdEstado() {
        return estadoIdEstado;
    }

    /**
     * Define el valor de la propiedad estadoIdEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link Estado }
     *     
     */
    public void setEstadoIdEstado(Estado value) {
        this.estadoIdEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechacreado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechacreado() {
        return fechacreado;
    }

    /**
     * Define el valor de la propiedad fechacreado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechacreado(XMLGregorianCalendar value) {
        this.fechacreado = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdUsuario(BigDecimal value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad personaIdpersona.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getPersonaIdpersona() {
        return personaIdpersona;
    }

    /**
     * Define el valor de la propiedad personaIdpersona.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setPersonaIdpersona(Persona value) {
        this.personaIdpersona = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTelefono(BigInteger value) {
        this.telefono = value;
    }

}
