
package fiduprod.wsfxf_wsdl.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para prcFdInterfazResponseElement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="prcFdInterfazResponseElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="result" type="{http://fiduprod/WsFXF.wsdl/types/}WsFXFUser_prcFdInterfaz_Out"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prcFdInterfazResponseElement", propOrder = {
    "result"
})
public class PrcFdInterfazResponseElement {

    @XmlElement(required = true, nillable = true)
    protected WsFXFUserPrcFdInterfazOut result;

    /**
     * Obtiene el valor de la propiedad result.
     * 
     * @return
     *     possible object is
     *     {@link WsFXFUserPrcFdInterfazOut }
     *     
     */
    public WsFXFUserPrcFdInterfazOut getResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     * 
     * @param value
     *     allowed object is
     *     {@link WsFXFUserPrcFdInterfazOut }
     *     
     */
    public void setResult(WsFXFUserPrcFdInterfazOut value) {
        this.result = value;
    }

}
