
package Services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Modificar_oferta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Modificar_oferta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precio_oferta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="min_compras" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="max_compras" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecha_actulizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Modificar_oferta", propOrder = {
    "id",
    "nombre",
    "descripcion",
    "precioOferta",
    "minCompras",
    "maxCompras",
    "fechaActulizacion"
})
public class ModificarOferta {

    protected int id;
    protected String nombre;
    protected String descripcion;
    @XmlElement(name = "precio_oferta")
    protected int precioOferta;
    @XmlElement(name = "min_compras")
    protected int minCompras;
    @XmlElement(name = "max_compras")
    protected int maxCompras;
    @XmlElement(name = "fecha_actulizacion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActulizacion;

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
     * Obtiene el valor de la propiedad precioOferta.
     * 
     */
    public int getPrecioOferta() {
        return precioOferta;
    }

    /**
     * Define el valor de la propiedad precioOferta.
     * 
     */
    public void setPrecioOferta(int value) {
        this.precioOferta = value;
    }

    /**
     * Obtiene el valor de la propiedad minCompras.
     * 
     */
    public int getMinCompras() {
        return minCompras;
    }

    /**
     * Define el valor de la propiedad minCompras.
     * 
     */
    public void setMinCompras(int value) {
        this.minCompras = value;
    }

    /**
     * Obtiene el valor de la propiedad maxCompras.
     * 
     */
    public int getMaxCompras() {
        return maxCompras;
    }

    /**
     * Define el valor de la propiedad maxCompras.
     * 
     */
    public void setMaxCompras(int value) {
        this.maxCompras = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActulizacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActulizacion() {
        return fechaActulizacion;
    }

    /**
     * Define el valor de la propiedad fechaActulizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActulizacion(XMLGregorianCalendar value) {
        this.fechaActulizacion = value;
    }

}
