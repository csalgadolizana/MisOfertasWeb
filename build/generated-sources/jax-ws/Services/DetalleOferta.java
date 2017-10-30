
package Services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detalleOferta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleOferta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detalleOfertaPK" type="{http://Servicios/}detalleOfertaPK" minOccurs="0"/&gt;
 *         &lt;element name="oferta" type="{http://Servicios/}oferta" minOccurs="0"/&gt;
 *         &lt;element name="producto" type="{http://Servicios/}producto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleOferta", propOrder = {
    "detalleOfertaPK",
    "oferta",
    "producto"
})
public class DetalleOferta {

    protected DetalleOfertaPK detalleOfertaPK;
    protected Oferta oferta;
    protected Producto producto;

    /**
     * Obtiene el valor de la propiedad detalleOfertaPK.
     * 
     * @return
     *     possible object is
     *     {@link DetalleOfertaPK }
     *     
     */
    public DetalleOfertaPK getDetalleOfertaPK() {
        return detalleOfertaPK;
    }

    /**
     * Define el valor de la propiedad detalleOfertaPK.
     * 
     * @param value
     *     allowed object is
     *     {@link DetalleOfertaPK }
     *     
     */
    public void setDetalleOfertaPK(DetalleOfertaPK value) {
        this.detalleOfertaPK = value;
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
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link Producto }
     *     
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link Producto }
     *     
     */
    public void setProducto(Producto value) {
        this.producto = value;
    }

}
