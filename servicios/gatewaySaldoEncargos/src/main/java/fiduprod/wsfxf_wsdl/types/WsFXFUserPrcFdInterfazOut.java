
package fiduprod.wsfxf_wsdl.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WsFXFUser_prcFdInterfaz_Out complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WsFXFUser_prcFdInterfaz_Out"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errnumOut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="imensajeerrorOut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descrOut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="imensajeterceroInout" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ivalidacionOut" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsFXFUser_prcFdInterfaz_Out", propOrder = {
    "errnumOut",
    "imensajeerrorOut",
    "descrOut",
    "imensajeterceroInout",
    "ivalidacionOut"
})
public class WsFXFUserPrcFdInterfazOut {

    @XmlElement(required = true, nillable = true)
    protected String errnumOut;
    @XmlElement(required = true, nillable = true)
    protected String imensajeerrorOut;
    @XmlElement(required = true, nillable = true)
    protected String descrOut;
    @XmlElement(required = true, nillable = true)
    protected String imensajeterceroInout;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal ivalidacionOut;

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
     * Obtiene el valor de la propiedad imensajeerrorOut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImensajeerrorOut() {
        return imensajeerrorOut;
    }

    /**
     * Define el valor de la propiedad imensajeerrorOut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImensajeerrorOut(String value) {
        this.imensajeerrorOut = value;
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
     * Obtiene el valor de la propiedad imensajeterceroInout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImensajeterceroInout() {
        return imensajeterceroInout;
    }

    /**
     * Define el valor de la propiedad imensajeterceroInout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImensajeterceroInout(String value) {
        this.imensajeterceroInout = value;
    }

    /**
     * Obtiene el valor de la propiedad ivalidacionOut.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIvalidacionOut() {
        return ivalidacionOut;
    }

    /**
     * Define el valor de la propiedad ivalidacionOut.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIvalidacionOut(BigDecimal value) {
        this.ivalidacionOut = value;
    }

}
