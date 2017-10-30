
package Services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ofertalocal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ofertalocal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="local" type="{http://Servicios/}local" minOccurs="0"/&gt;
 *         &lt;element name="oferta" type="{http://Servicios/}oferta" minOccurs="0"/&gt;
 *         &lt;element name="ofertalocalPK" type="{http://Servicios/}ofertalocalPK" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ofertalocal", propOrder = {
    "descripcion",
    "local",
    "oferta",
    "ofertalocalPK"
})
public class Ofertalocal {

    protected String descripcion;
    protected Local local;
    protected Oferta oferta;
    protected OfertalocalPK ofertalocalPK;

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad local.
     * 
     * @return
     *     possible object is
     *     {@link Local }
     *     
     */
    public Local getLocal() {
        return local;
    }

    /**
     * Define el valor de la propiedad local.
     * 
     * @param value
     *     allowed object is
     *     {@link Local }
     *     
     */
    public void setLocal(Local value) {
        this.local = value;
    }

    /**
     * Obtiene el valor de la propiedad oferta.
     * 
     * @return
     *     possible object is
     *     {@link Oferta }
     *     
     */
    public Oferta getOferta() {
        return oferta;
    }

    /**
     * Define el valor de la propiedad oferta.
     * 
     * @param value
     *     allowed object is
     *     {@link Oferta }
     *     
     */
    public void setOferta(Oferta value) {
        this.oferta = value;
    }

    /**
     * Obtiene el valor de la propiedad ofertalocalPK.
     * 
     * @return
     *     possible object is
     *     {@link OfertalocalPK }
     *     
     */
    public OfertalocalPK getOfertalocalPK() {
        return ofertalocalPK;
    }

    /**
     * Define el valor de la propiedad ofertalocalPK.
     * 
     * @param value
     *     allowed object is
     *     {@link OfertalocalPK }
     *     
     */
    public void setOfertalocalPK(OfertalocalPK value) {
        this.ofertalocalPK = value;
    }

}
