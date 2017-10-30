
package Services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Crear_detalle_oferta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Crear_detalle_oferta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_detalle_oferta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="producto_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="oferta_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Crear_detalle_oferta", propOrder = {
    "idDetalleOferta",
    "productoId",
    "ofertaId"
})
public class CrearDetalleOferta {

    @XmlElement(name = "id_detalle_oferta")
    protected int idDetalleOferta;
    @XmlElement(name = "producto_id")
    protected int productoId;
    @XmlElement(name = "oferta_id")
    protected int ofertaId;

    /**
     * Obtiene el valor de la propiedad idDetalleOferta.
     * 
     */
    public int getIdDetalleOferta() {
        return idDetalleOferta;
    }

    /**
     * Define el valor de la propiedad idDetalleOferta.
     * 
     */
    public void setIdDetalleOferta(int value) {
        this.idDetalleOferta = value;
    }

    /**
     * Obtiene el valor de la propiedad productoId.
     * 
     */
    public int getProductoId() {
        return productoId;
    }

    /**
     * Define el valor de la propiedad productoId.
     * 
     */
    public void setProductoId(int value) {
        this.productoId = value;
    }

    /**
     * Obtiene el valor de la propiedad ofertaId.
     * 
     */
    public int getOfertaId() {
        return ofertaId;
    }

    /**
     * Define el valor de la propiedad ofertaId.
     * 
     */
    public void setOfertaId(int value) {
        this.ofertaId = value;
    }

}
