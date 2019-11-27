
package fiduprod.wsfxf_wsdl.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fiduprod.wsfxf_wsdl.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PrcFdInterfazElement_QNAME = new QName("http://fiduprod/WsFXF.wsdl/types/", "prcFdInterfazElement");
    private final static QName _PrcFdInterfazResponseElement_QNAME = new QName("http://fiduprod/WsFXF.wsdl/types/", "prcFdInterfazResponseElement");
    private final static QName _PrcFdPrecancelacionResponseElement_QNAME = new QName("http://fiduprod/WsFXF.wsdl/types/", "prcFdPrecancelacionResponseElement");
    private final static QName _PrcFdValidarSaldoElement_QNAME = new QName("http://fiduprod/WsFXF.wsdl/types/", "prcFdValidarSaldoElement");
    private final static QName _PrcFdValidarSaldoResponseElement_QNAME = new QName("http://fiduprod/WsFXF.wsdl/types/", "prcFdValidarSaldoResponseElement");
    private final static QName _PrcInsertaFdTmovimientoElement_QNAME = new QName("http://fiduprod/WsFXF.wsdl/types/", "prcInsertaFdTmovimientoElement");
    private final static QName _PrcInsertaFdTmovimientoResponseElement_QNAME = new QName("http://fiduprod/WsFXF.wsdl/types/", "prcInsertaFdTmovimientoResponseElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fiduprod.wsfxf_wsdl.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrcFdInterfazElement }
     * 
     */
    public PrcFdInterfazElement createPrcFdInterfazElement() {
        return new PrcFdInterfazElement();
    }

    /**
     * Create an instance of {@link PrcFdInterfazResponseElement }
     * 
     */
    public PrcFdInterfazResponseElement createPrcFdInterfazResponseElement() {
        return new PrcFdInterfazResponseElement();
    }

    /**
     * Create an instance of {@link PrcFdPrecancelacionResponseElement }
     * 
     */
    public PrcFdPrecancelacionResponseElement createPrcFdPrecancelacionResponseElement() {
        return new PrcFdPrecancelacionResponseElement();
    }

    /**
     * Create an instance of {@link PrcFdValidarSaldoElement }
     * 
     */
    public PrcFdValidarSaldoElement createPrcFdValidarSaldoElement() {
        return new PrcFdValidarSaldoElement();
    }

    /**
     * Create an instance of {@link PrcFdValidarSaldoResponseElement }
     * 
     */
    public PrcFdValidarSaldoResponseElement createPrcFdValidarSaldoResponseElement() {
        return new PrcFdValidarSaldoResponseElement();
    }

    /**
     * Create an instance of {@link PrcInsertaFdTmovimientoElement }
     * 
     */
    public PrcInsertaFdTmovimientoElement createPrcInsertaFdTmovimientoElement() {
        return new PrcInsertaFdTmovimientoElement();
    }

    /**
     * Create an instance of {@link PrcInsertaFdTmovimientoResponseElement }
     * 
     */
    public PrcInsertaFdTmovimientoResponseElement createPrcInsertaFdTmovimientoResponseElement() {
        return new PrcInsertaFdTmovimientoResponseElement();
    }

    /**
     * Create an instance of {@link WsFXFUserPrcFdInterfazOut }
     * 
     */
    public WsFXFUserPrcFdInterfazOut createWsFXFUserPrcFdInterfazOut() {
        return new WsFXFUserPrcFdInterfazOut();
    }

    /**
     * Create an instance of {@link WsFXFUserPrcFdPrecancelacionOut }
     * 
     */
    public WsFXFUserPrcFdPrecancelacionOut createWsFXFUserPrcFdPrecancelacionOut() {
        return new WsFXFUserPrcFdPrecancelacionOut();
    }

    /**
     * Create an instance of {@link WsFXFUserPrcFdValidarSaldoOut }
     * 
     */
    public WsFXFUserPrcFdValidarSaldoOut createWsFXFUserPrcFdValidarSaldoOut() {
        return new WsFXFUserPrcFdValidarSaldoOut();
    }

    /**
     * Create an instance of {@link WsFXFUserPrcInsertaFdTmovimientoOut }
     * 
     */
    public WsFXFUserPrcInsertaFdTmovimientoOut createWsFXFUserPrcInsertaFdTmovimientoOut() {
        return new WsFXFUserPrcInsertaFdTmovimientoOut();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrcFdInterfazElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fiduprod/WsFXF.wsdl/types/", name = "prcFdInterfazElement")
    public JAXBElement<PrcFdInterfazElement> createPrcFdInterfazElement(PrcFdInterfazElement value) {
        return new JAXBElement<PrcFdInterfazElement>(_PrcFdInterfazElement_QNAME, PrcFdInterfazElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrcFdInterfazResponseElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fiduprod/WsFXF.wsdl/types/", name = "prcFdInterfazResponseElement")
    public JAXBElement<PrcFdInterfazResponseElement> createPrcFdInterfazResponseElement(PrcFdInterfazResponseElement value) {
        return new JAXBElement<PrcFdInterfazResponseElement>(_PrcFdInterfazResponseElement_QNAME, PrcFdInterfazResponseElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrcFdPrecancelacionResponseElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fiduprod/WsFXF.wsdl/types/", name = "prcFdPrecancelacionResponseElement")
    public JAXBElement<PrcFdPrecancelacionResponseElement> createPrcFdPrecancelacionResponseElement(PrcFdPrecancelacionResponseElement value) {
        return new JAXBElement<PrcFdPrecancelacionResponseElement>(_PrcFdPrecancelacionResponseElement_QNAME, PrcFdPrecancelacionResponseElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrcFdValidarSaldoElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fiduprod/WsFXF.wsdl/types/", name = "prcFdValidarSaldoElement")
    public JAXBElement<PrcFdValidarSaldoElement> createPrcFdValidarSaldoElement(PrcFdValidarSaldoElement value) {
        return new JAXBElement<PrcFdValidarSaldoElement>(_PrcFdValidarSaldoElement_QNAME, PrcFdValidarSaldoElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrcFdValidarSaldoResponseElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fiduprod/WsFXF.wsdl/types/", name = "prcFdValidarSaldoResponseElement")
    public JAXBElement<PrcFdValidarSaldoResponseElement> createPrcFdValidarSaldoResponseElement(PrcFdValidarSaldoResponseElement value) {
        return new JAXBElement<PrcFdValidarSaldoResponseElement>(_PrcFdValidarSaldoResponseElement_QNAME, PrcFdValidarSaldoResponseElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrcInsertaFdTmovimientoElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fiduprod/WsFXF.wsdl/types/", name = "prcInsertaFdTmovimientoElement")
    public JAXBElement<PrcInsertaFdTmovimientoElement> createPrcInsertaFdTmovimientoElement(PrcInsertaFdTmovimientoElement value) {
        return new JAXBElement<PrcInsertaFdTmovimientoElement>(_PrcInsertaFdTmovimientoElement_QNAME, PrcInsertaFdTmovimientoElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrcInsertaFdTmovimientoResponseElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fiduprod/WsFXF.wsdl/types/", name = "prcInsertaFdTmovimientoResponseElement")
    public JAXBElement<PrcInsertaFdTmovimientoResponseElement> createPrcInsertaFdTmovimientoResponseElement(PrcInsertaFdTmovimientoResponseElement value) {
        return new JAXBElement<PrcInsertaFdTmovimientoResponseElement>(_PrcInsertaFdTmovimientoResponseElement_QNAME, PrcInsertaFdTmovimientoResponseElement.class, null, value);
    }

}
