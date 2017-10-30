
package Services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ofertavisi complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ofertavisi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clienteIdCliente" type="{http://Servicios/}cliente" minOccurs="0"/&gt;
 *         &lt;element name="fechaVisita" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idofertav" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ofertaIdOferta" type="{http://Servicios/}oferta" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ofertavisi", propOrder = {
    "clienteIdCliente",
    "fechaVisita",
    "idofertav",
    "ofertaIdOferta"
})
public class Ofertavisi {

    protected Cliente clienteIdCliente;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVisita;
    protected BigDecimal idofertav;
    protected Oferta ofertaIdOferta;

    /**
     * Obtiene el valor de la propiedad clienteIdCliente.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getClienteIdCliente() {
        return clienteIdCliente;
    }

    /**
     * Define el valor de la propiedad clienteIdCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setClienteIdCliente(Cliente value) {
        this.clienteIdCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVisita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVisita() {
        return fechaVisita;
    }

    /**
     * Define el valor de la propiedad fechaVisita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVisita(XMLGregorianCalendar value) {
        this.fechaVisita = value;
    }

    /**
     * Obtiene el valor de la propiedad idofertav.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIdofertav() {
        return idofertav;
    }

    /**
     * Define el valor de la propiedad idofertav.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIdofertav(BigDecimal value) {
        this.idofertav = value;
    }

    /**
     * Obtiene el valor de la propiedad ofertaIdOferta.
     * 
     * @return
     *     possible object is
     *     {@link Oferta }
     *     
     */
    public Oferta getOfertaIdOferta() {
        return ofertaIdOferta;
    }

    /**
     * Define el valor de la propiedad ofertaIdOferta.
     * 
     * @param value
     *     allowed object is
     *     {@link Oferta }
     *     
     */
    public void setOfertaIdOferta(Oferta value) {
        this.ofertaIdOferta = value;
    }

}
