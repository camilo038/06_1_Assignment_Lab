
package fiduprod.wsfxf_wsdl.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para prcFdValidarSaldoResponseElement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="prcFdValidarSaldoResponseElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="result" type="{http://fiduprod/WsFXF.wsdl/types/}WsFXFUser_prcFdValidarSaldo_Out"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prcFdValidarSaldoResponseElement", propOrder = {
    "result"
})
public class PrcFdValidarSaldoResponseElement {

    @XmlElement(required = true, nillable = true)
    protected WsFXFUserPrcFdValidarSaldoOut result;

    /**
     * Obtiene el valor de la propiedad result.
     * 
     * @return
     *     possible object is
     *     {@link WsFXFUserPrcFdValidarSaldoOut }
     *     
     */
    public WsFXFUserPrcFdValidarSaldoOut getResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     * 
     * @param value
     *     allowed object is
     *     {@link WsFXFUserPrcFdValidarSaldoOut }
     *     
     */
    public void setResult(WsFXFUserPrcFdValidarSaldoOut value) {
        this.result = value;
    }

}
