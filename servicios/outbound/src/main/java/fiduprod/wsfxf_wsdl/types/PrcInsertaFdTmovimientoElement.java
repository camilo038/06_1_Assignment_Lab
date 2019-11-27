
package fiduprod.wsfxf_wsdl.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para prcInsertaFdTmovimientoElement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="prcInsertaFdTmovimientoElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auxi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ciasDest" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="encargo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="encargoDest" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="entidad" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="pFpago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pOrpaVigencia" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="pOrpaNumero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pValor" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="pGravamen" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="pCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pMoviCtaDest" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="pMoviTpctDest" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pMoviTpctPag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pFondo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pTipoReg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prcInsertaFdTmovimientoElement", propOrder = {
    "auxi",
    "cias",
    "ciasDest",
    "descri",
    "encargo",
    "encargoDest",
    "entidad",
    "fecha",
    "pFpago",
    "pOrpaVigencia",
    "pOrpaNumero",
    "pValor",
    "pGravamen",
    "pCuenta",
    "pMoviCtaDest",
    "pMoviTpctDest",
    "pMoviTpctPag",
    "pFondo",
    "pTipoReg"
})
public class PrcInsertaFdTmovimientoElement {

    @XmlElement(required = true, nillable = true)
    protected String auxi;
    @XmlElement(required = true, nillable = true)
    protected String cias;
    @XmlElement(required = true, nillable = true)
    protected String ciasDest;
    @XmlElement(required = true, nillable = true)
    protected String descri;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal encargo;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal encargoDest;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal entidad;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(required = true, nillable = true)
    protected String pFpago;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal pOrpaVigencia;
    @XmlElement(required = true, nillable = true)
    protected String pOrpaNumero;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal pValor;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal pGravamen;
    @XmlElement(required = true, nillable = true)
    protected String pCuenta;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal pMoviCtaDest;
    @XmlElement(required = true, nillable = true)
    protected String pMoviTpctDest;
    @XmlElement(required = true, nillable = true)
    protected String pMoviTpctPag;
    @XmlElement(required = true, nillable = true)
    protected String pFondo;
    @XmlElement(required = true, nillable = true)
    protected String pTipoReg;

    /**
     * Obtiene el valor de la propiedad auxi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxi() {
        return auxi;
    }

    /**
     * Define el valor de la propiedad auxi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxi(String value) {
        this.auxi = value;
    }

    /**
     * Obtiene el valor de la propiedad cias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCias() {
        return cias;
    }

    /**
     * Define el valor de la propiedad cias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCias(String value) {
        this.cias = value;
    }

    /**
     * Obtiene el valor de la propiedad ciasDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiasDest() {
        return ciasDest;
    }

    /**
     * Define el valor de la propiedad ciasDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiasDest(String value) {
        this.ciasDest = value;
    }

    /**
     * Obtiene el valor de la propiedad descri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescri() {
        return descri;
    }

    /**
     * Define el valor de la propiedad descri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescri(String value) {
        this.descri = value;
    }

    /**
     * Obtiene el valor de la propiedad encargo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEncargo() {
        return encargo;
    }

    /**
     * Define el valor de la propiedad encargo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEncargo(BigDecimal value) {
        this.encargo = value;
    }

    /**
     * Obtiene el valor de la propiedad encargoDest.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEncargoDest() {
        return encargoDest;
    }

    /**
     * Define el valor de la propiedad encargoDest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEncargoDest(BigDecimal value) {
        this.encargoDest = value;
    }

    /**
     * Obtiene el valor de la propiedad entidad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEntidad() {
        return entidad;
    }

    /**
     * Define el valor de la propiedad entidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEntidad(BigDecimal value) {
        this.entidad = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad pFpago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFpago() {
        return pFpago;
    }

    /**
     * Define el valor de la propiedad pFpago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFpago(String value) {
        this.pFpago = value;
    }

    /**
     * Obtiene el valor de la propiedad pOrpaVigencia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPOrpaVigencia() {
        return pOrpaVigencia;
    }

    /**
     * Define el valor de la propiedad pOrpaVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPOrpaVigencia(BigDecimal value) {
        this.pOrpaVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad pOrpaNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOrpaNumero() {
        return pOrpaNumero;
    }

    /**
     * Define el valor de la propiedad pOrpaNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOrpaNumero(String value) {
        this.pOrpaNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad pValor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPValor() {
        return pValor;
    }

    /**
     * Define el valor de la propiedad pValor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPValor(BigDecimal value) {
        this.pValor = value;
    }

    /**
     * Obtiene el valor de la propiedad pGravamen.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPGravamen() {
        return pGravamen;
    }

    /**
     * Define el valor de la propiedad pGravamen.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPGravamen(BigDecimal value) {
        this.pGravamen = value;
    }

    /**
     * Obtiene el valor de la propiedad pCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCuenta() {
        return pCuenta;
    }

    /**
     * Define el valor de la propiedad pCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCuenta(String value) {
        this.pCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad pMoviCtaDest.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPMoviCtaDest() {
        return pMoviCtaDest;
    }

    /**
     * Define el valor de la propiedad pMoviCtaDest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPMoviCtaDest(BigDecimal value) {
        this.pMoviCtaDest = value;
    }

    /**
     * Obtiene el valor de la propiedad pMoviTpctDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMoviTpctDest() {
        return pMoviTpctDest;
    }

    /**
     * Define el valor de la propiedad pMoviTpctDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMoviTpctDest(String value) {
        this.pMoviTpctDest = value;
    }

    /**
     * Obtiene el valor de la propiedad pMoviTpctPag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMoviTpctPag() {
        return pMoviTpctPag;
    }

    /**
     * Define el valor de la propiedad pMoviTpctPag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMoviTpctPag(String value) {
        this.pMoviTpctPag = value;
    }

    /**
     * Obtiene el valor de la propiedad pFondo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFondo() {
        return pFondo;
    }

    /**
     * Define el valor de la propiedad pFondo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFondo(String value) {
        this.pFondo = value;
    }

    /**
     * Obtiene el valor de la propiedad pTipoReg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTipoReg() {
        return pTipoReg;
    }

    /**
     * Define el valor de la propiedad pTipoReg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTipoReg(String value) {
        this.pTipoReg = value;
    }

}
