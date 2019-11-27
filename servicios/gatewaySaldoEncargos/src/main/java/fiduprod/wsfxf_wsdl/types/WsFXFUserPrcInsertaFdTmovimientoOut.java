
package fiduprod.wsfxf_wsdl.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WsFXFUser_prcInsertaFdTmovimiento_Out complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WsFXFUser_prcInsertaFdTmovimiento_Out"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errnumOut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descrOut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vmovirenglonOut" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="perrorOut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsFXFUser_prcInsertaFdTmovimiento_Out", propOrder = {
    "errnumOut",
    "descrOut",
    "vmovirenglonOut",
    "perrorOut"
})
public class WsFXFUserPrcInsertaFdTmovimientoOut {

    @XmlElement(required = true, nillable = true)
    protected String errnumOut;
    @XmlElement(required = true, nillable = true)
    protected String descrOut;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal vmovirenglonOut;
    @XmlElement(required = true, nillable = true)
    protected String perrorOut;

    /**
     * Obtiene el valor de la propiedad errnumOut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrnumOut() {
        return errnumOut;
    }

    /**
     * Define el valor de la propiedad errnumOut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrnumOut(String value) {
        this.errnumOut = value;
    }

    /**
     * Obtiene el valor de la propiedad descrOut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrOut() {
        return descrOut;
    }

    /**
     * Define el valor de la propiedad descrOut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrOut(String value) {
        this.descrOut = value;
    }

    /**
     * Obtiene el valor de la propiedad vmovirenglonOut.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVmovirenglonOut() {
        return vmovirenglonOut;
    }

    /**
     * Define el valor de la propiedad vmovirenglonOut.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVmovirenglonOut(BigDecimal value) {
        this.vmovirenglonOut = value;
    }

    /**
     * Obtiene el valor de la propiedad perrorOut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerrorOut() {
        return perrorOut;
    }

    /**
     * Define el valor de la propiedad perrorOut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerrorOut(String value) {
        this.perrorOut = value;
    }

}
