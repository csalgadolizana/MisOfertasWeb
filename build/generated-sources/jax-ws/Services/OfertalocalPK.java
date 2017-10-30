
package Services;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ofertalocalPK complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ofertalocalPK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idofertalocal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="localIdLocal" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ofertaIdOferta" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ofertalocalPK", propOrder = {
    "idofertalocal",
    "localIdLocal",
    "ofertaIdOferta"
})
public class OfertalocalPK {

    protected BigInteger idofertalocal;
    protected BigInteger localIdLocal;
    protected BigInteger ofertaIdOferta;

    /**
     * Obtiene el valor de la propiedad idofertalocal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdofertalocal() {
        return idofertalocal;
    }

    /**
     * Define el valor de la propiedad idofertalocal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdofertalocal(BigInteger value) {
        this.idofertalocal = value;
    }

    /**
     * Obtiene el valor de la propiedad localIdLocal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocalIdLocal() {
        return localIdLocal;
    }

    /**
     * Define el valor de la propiedad localIdLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocalIdLocal(BigInteger value) {
        this.localIdLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad ofertaIdOferta.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfertaIdOferta() {
        return ofertaIdOferta;
    }

    /**
     * Define el valor de la propiedad ofertaIdOferta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfertaIdOferta(BigInteger value) {
        this.ofertaIdOferta = value;
    }

}
