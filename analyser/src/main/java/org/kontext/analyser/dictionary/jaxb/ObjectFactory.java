//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.30 at 01:36:12 PM PDT 
//


package org.kontext.analyser.dictionary.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.kontext.analyser.dictionary.jaxb package. 
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

    private final static QName _EntryList_QNAME = new QName("", "entry_list");
    private final static QName _SensTypeSynIt_QNAME = new QName("", "it");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.kontext.analyser.dictionary.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SensType }
     * 
     */
    public SensType createSensType() {
        return new SensType();
    }

    /**
     * Create an instance of {@link EntryListType }
     * 
     */
    public EntryListType createEntryListType() {
        return new EntryListType();
    }

    /**
     * Create an instance of {@link EntryType }
     * 
     */
    public EntryType createEntryType() {
        return new EntryType();
    }

    /**
     * Create an instance of {@link ViType }
     * 
     */
    public ViType createViType() {
        return new ViType();
    }

    /**
     * Create an instance of {@link TermType }
     * 
     */
    public TermType createTermType() {
        return new TermType();
    }

    /**
     * Create an instance of {@link RelType }
     * 
     */
    public RelType createRelType() {
        return new RelType();
    }

    /**
     * Create an instance of {@link SynType }
     * 
     */
    public SynType createSynType() {
        return new SynType();
    }

    /**
     * Create an instance of {@link SensType.Syn }
     * 
     */
    public SensType.Syn createSensTypeSyn() {
        return new SensType.Syn();
    }

    /**
     * Create an instance of {@link SensType.Rel }
     * 
     */
    public SensType.Rel createSensTypeRel() {
        return new SensType.Rel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntryListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "entry_list")
    public JAXBElement<EntryListType> createEntryList(EntryListType value) {
        return new JAXBElement<EntryListType>(_EntryList_QNAME, EntryListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "it", scope = SensType.Syn.class)
    public JAXBElement<String> createSensTypeSynIt(String value) {
        return new JAXBElement<String>(_SensTypeSynIt_QNAME, String.class, SensType.Syn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "it", scope = ViType.class)
    public JAXBElement<String> createViTypeIt(String value) {
        return new JAXBElement<String>(_SensTypeSynIt_QNAME, String.class, ViType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "it", scope = SynType.class)
    public JAXBElement<String> createSynTypeIt(String value) {
        return new JAXBElement<String>(_SensTypeSynIt_QNAME, String.class, SynType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "it", scope = SensType.Rel.class)
    public JAXBElement<String> createSensTypeRelIt(String value) {
        return new JAXBElement<String>(_SensTypeSynIt_QNAME, String.class, SensType.Rel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "it", scope = RelType.class)
    public JAXBElement<String> createRelTypeIt(String value) {
        return new JAXBElement<String>(_SensTypeSynIt_QNAME, String.class, RelType.class, value);
    }

}
