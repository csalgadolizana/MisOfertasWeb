
package Services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Crear_oferta_local complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Crear_oferta_local"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oferta_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="local_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Crear_oferta_local", propOrder = {
    "id",
    "descripcion",
    "ofertaId",
    "localId"
})
public class CrearOfertaLocal {

    protected int id;
    protected String descripcion;
    @XmlElement(name = "oferta_id")
    protected int ofertaId;
    @XmlElement(name = "local_id")
    protected int localId;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

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

    /**
     * Obtiene el valor de la propiedad localId.
     * 
     */
    public int getLocalId() {
        return localId;
    }

    /**
     * Define el valor de la propiedad localId.
     * 
     */
    public void setLocalId(int value) {
        this.localId = value;
    }

}
