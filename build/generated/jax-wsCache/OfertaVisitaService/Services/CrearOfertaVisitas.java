
package Services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Crear_oferta_visitas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Crear_oferta_visitas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fecha_vista" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_oferta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Crear_oferta_visitas", propOrder = {
    "fechaVista",
    "idCliente",
    "idOferta"
})
public class CrearOfertaVisitas {

    @XmlElement(name = "fecha_vista")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVista;
    @XmlElement(name = "id_cliente")
    protected int idCliente;
    @XmlElement(name = "id_oferta")
    protected int idOferta;

    /**
     * Obtiene el valor de la propiedad fechaVista.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVista() {
        return fechaVista;
    }

    /**
     * Define el valor de la propiedad fechaVista.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVista(XMLGregorianCalendar value) {
        this.fechaVista = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad idOferta.
     * 
     */
    public int getIdOferta() {
        return idOferta;
    }

    /**
     * Define el valor de la propiedad idOferta.
     * 
     */
    public void setIdOferta(int value) {
        this.idOferta = value;
    }

}
