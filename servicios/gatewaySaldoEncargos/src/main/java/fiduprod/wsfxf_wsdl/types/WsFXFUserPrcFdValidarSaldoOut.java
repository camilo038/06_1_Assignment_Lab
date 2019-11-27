
package fiduprod.wsfxf_wsdl.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WsFXFUser_prcFdValidarSaldo_Out complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WsFXFUser_prcFdValidarSaldo_Out"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errnumOut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="saldoOut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descrOut" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsFXFUser_prcFdValidarSaldo_Out", propOrder = {
    "errnumOut",
    "saldoOut",
    "descrOut"
})
public class WsFXFUserPrcFdValidarSaldoOut {

    @XmlElement(required = true, nillable = true)
    protected String errnumOut;
    @XmlElement(required = true, nillable = true)
    protected String saldoOut;
    @XmlElement(required = true, nillable = true)
    protected String descrOut;

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
     * Obtiene el valor de la propiedad saldoOut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaldoOut() {
        return saldoOut;
    }

    /**
     * Define el valor de la propiedad saldoOut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaldoOut(String value) {
        this.saldoOut = value;
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

}
