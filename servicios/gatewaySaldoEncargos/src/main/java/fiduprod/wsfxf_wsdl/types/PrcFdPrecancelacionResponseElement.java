
package fiduprod.wsfxf_wsdl.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para prcFdPrecancelacionResponseElement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="prcFdPrecancelacionResponseElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="result" type="{http://fiduprod/WsFXF.wsdl/types/}WsFXFUser_prcFdPrecancelacion_Out"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prcFdPrecancelacionResponseElement", propOrder = {
    "result"
})
public class PrcFdPrecancelacionResponseElement {

    @XmlElement(required = true, nillable = true)
    protected WsFXFUserPrcFdPrecancelacionOut result;

    /**
     * Obtiene el valor de la propiedad result.
     * 
     * @return
     *     possible object is
     *     {@link WsFXFUserPrcFdPrecancelacionOut }
     *     
     */
    public WsFXFUserPrcFdPrecancelacionOut getResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     * 
     * @param value
     *     allowed object is
     *     {@link WsFXFUserPrcFdPrecancelacionOut }
     *     
     */
    public void setResult(WsFXFUserPrcFdPrecancelacionOut value) {
        this.result = value;
    }

}
