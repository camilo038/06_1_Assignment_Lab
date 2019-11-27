
package fiduprod.wsfxf_wsdl.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para prcFdInterfazElement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="prcFdInterfazElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pMoviTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pMoviCias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pMoviCiasOrig" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pMoviOficina" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="pMoviNumero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pMoviRenglon" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="p1AplicaNx1000" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="iMensajeTercero_inout" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prcFdInterfazElement", propOrder = {
    "pMoviTipoDoc",
    "pMoviCias",
    "pMoviCiasOrig",
    "pMoviOficina",
    "pMoviNumero",
    "pMoviRenglon",
    "p1AplicaNx1000",
    "iMensajeTerceroInout"
})
public class PrcFdInterfazElement {

    @XmlElement(required = true, nillable = true)
    protected String pMoviTipoDoc;
    @XmlElement(required = true, nillable = true)
    protected String pMoviCias;
    @XmlElement(required = true, nillable = true)
    protected String pMoviCiasOrig;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal pMoviOficina;
    @XmlElement(required = true, nillable = true)
    protected String pMoviNumero;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal pMoviRenglon;
    @XmlElement(required = true, nillable = true)
    protected String p1AplicaNx1000;
    @XmlElement(name = "iMensajeTercero_inout", required = true, nillable = true)
    protected String iMensajeTerceroInout;

    /**
     * Obtiene el valor de la propiedad pMoviTipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMoviTipoDoc() {
        return pMoviTipoDoc;
    }

    /**
     * Define el valor de la propiedad pMoviTipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMoviTipoDoc(String value) {
        this.pMoviTipoDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad pMoviCias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMoviCias() {
        return pMoviCias;
    }

    /**
     * Define el valor de la propiedad pMoviCias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMoviCias(String value) {
        this.pMoviCias = value;
    }

    /**
     * Obtiene el valor de la propiedad pMoviCiasOrig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMoviCiasOrig() {
        return pMoviCiasOrig;
    }

    /**
     * Define el valor de la propiedad pMoviCiasOrig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMoviCiasOrig(String value) {
        this.pMoviCiasOrig = value;
    }

    /**
     * Obtiene el valor de la propiedad pMoviOficina.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPMoviOficina() {
        return pMoviOficina;
    }

    /**
     * Define el valor de la propiedad pMoviOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPMoviOficina(BigDecimal value) {
        this.pMoviOficina = value;
    }

    /**
     * Obtiene el valor de la propiedad pMoviNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMoviNumero() {
        return pMoviNumero;
    }

    /**
     * Define el valor de la propiedad pMoviNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMoviNumero(String value) {
        this.pMoviNumero = value;
    }

    /**
     * Obtiene el valor de la propiedad pMoviRenglon.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPMoviRenglon() {
        return pMoviRenglon;
    }

    /**
     * Define el valor de la propiedad pMoviRenglon.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPMoviRenglon(BigDecimal value) {
        this.pMoviRenglon = value;
    }

    /**
     * Obtiene el valor de la propiedad p1AplicaNx1000.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP1AplicaNx1000() {
        return p1AplicaNx1000;
    }

    /**
     * Define el valor de la propiedad p1AplicaNx1000.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP1AplicaNx1000(String value) {
        this.p1AplicaNx1000 = value;
    }

    /**
     * Obtiene el valor de la propiedad iMensajeTerceroInout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMensajeTerceroInout() {
        return iMensajeTerceroInout;
    }

    /**
     * Define el valor de la propiedad iMensajeTerceroInout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMensajeTerceroInout(String value) {
        this.iMensajeTerceroInout = value;
    }

}
