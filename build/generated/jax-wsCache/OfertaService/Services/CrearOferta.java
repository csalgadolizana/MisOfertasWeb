
package Services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Crear_oferta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Crear_oferta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precio_normal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="precio_oferta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numero_visitas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="min_compras" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="max_compras" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecha_inicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecha_actulizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="estado_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Crear_oferta", propOrder = {
    "id",
    "nombre",
    "descripcion",
    "precioNormal",
    "precioOferta",
    "numeroVisitas",
    "minCompras",
    "maxCompras",
    "fechaInicio",
    "fechaActulizacion",
    "estadoId"
})
public class CrearOferta {

    protected int id;
    protected String nombre;
    protected String descripcion;
    @XmlElement(name = "precio_normal")
    protected int precioNormal;
    @XmlElement(name = "precio_oferta")
    protected int precioOferta;
    @XmlElement(name = "numero_visitas")
    protected int numeroVisitas;
    @XmlElement(name = "min_compras")
    protected int minCompras;
    @XmlElement(name = "max_compras")
    protected int maxCompras;
    @XmlElement(name = "fecha_inicio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicio;
    @XmlElement(name = "fecha_actulizacion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActulizacion;
    @XmlElement(name = "estado_id")
    protected int estadoId;

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
     * Obtiene el valor de la propiedad precioNormal.
     * 
     */
    public int getPrecioNormal() {
        return precioNormal;
    }

    /**
     * Define el valor de la propiedad precioNormal.
     * 
     */
    public void setPrecioNormal(int value) {
        this.precioNormal = value;
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
     * Obtiene el valor de la propiedad numeroVisitas.
     * 
     */
    public int getNumeroVisitas() {
        return numeroVisitas;
    }

    /**
     * Define el valor de la propiedad numeroVisitas.
     * 
     */
    public void setNumeroVisitas(int value) {
        this.numeroVisitas = value;
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
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicio(XMLGregorianCalendar value) {
        this.fechaInicio = value;
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

    /**
     * Obtiene el valor de la propiedad estadoId.
     * 
     */
    public int getEstadoId() {
        return estadoId;
    }

    /**
     * Define el valor de la propiedad estadoId.
     * 
     */
    public void setEstadoId(int value) {
        this.estadoId = value;
    }

}
