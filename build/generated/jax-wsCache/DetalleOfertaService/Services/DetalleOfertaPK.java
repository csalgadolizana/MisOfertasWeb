
package Services;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detalleOfertaPK complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleOfertaPK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idDetOferta" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ofertaIdOferta" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="productoIdProducto" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleOfertaPK", propOrder = {
    "idDetOferta",
    "ofertaIdOferta",
    "productoIdProducto"
})
public class DetalleOfertaPK {

    protected BigInteger idDetOferta;
    protected BigInteger ofertaIdOferta;
    protected BigInteger productoIdProducto;

    /**
     * Obtiene el valor de la propiedad idDetOferta.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdDetOferta() {
        return idDetOferta;
    }

    /**
     * Define el valor de la propiedad idDetOferta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdDetOferta(BigInteger value) {
        this.idDetOferta = value;
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

    /**
     * Obtiene el valor de la propiedad productoIdProducto.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductoIdProducto() {
        return productoIdProducto;
    }

    /**
     * Define el valor de la propiedad productoIdProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductoIdProducto(BigInteger value) {
        this.productoIdProducto = value;
    }

}
