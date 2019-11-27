
package fiduprod.wsfxf_wsdl.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para prcFdValidarSaldoElement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="prcFdValidarSaldoElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moviCtcoNegocio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="moviCtcoCiasNego" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="moviEncargo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prcFdValidarSaldoElement", propOrder = {
    "moviCtcoNegocio",
    "moviCtcoCiasNego",
    "moviEncargo"
})
public class PrcFdValidarSaldoElement {

    @XmlElement(required = true, nillable = true)
    protected String moviCtcoNegocio;
    @XmlElement(required = true, nillable = true)
    protected String moviCtcoCiasNego;
    @XmlElement(required = true, nillable = true)
    protected String moviEncargo;

    /**
     * Obtiene el valor de la propiedad moviCtcoNegocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoviCtcoNegocio() {
        return moviCtcoNegocio;
    }

    /**
     * Define el valor de la propiedad moviCtcoNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoviCtcoNegocio(String value) {
        this.moviCtcoNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad moviCtcoCiasNego.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoviCtcoCiasNego() {
        return moviCtcoCiasNego;
    }

    /**
     * Define el valor de la propiedad moviCtcoCiasNego.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoviCtcoCiasNego(String value) {
        this.moviCtcoCiasNego = value;
    }

    /**
     * Obtiene el valor de la propiedad moviEncargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoviEncargo() {
        return moviEncargo;
    }

    /**
     * Define el valor de la propiedad moviEncargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoviEncargo(String value) {
        this.moviEncargo = value;
    }

}
