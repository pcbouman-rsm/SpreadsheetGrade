//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.18 at 10:13:24 PM CEST 
//


package nl.eur.spreadsheettest.xml;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.eur.spreadsheettest.xml package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.eur.spreadsheettest.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exercise }
     * 
     */
    public Exercise createExercise() {
        return new Exercise();
    }

    /**
     * Create an instance of {@link TestcasesType }
     * 
     */
    public TestcasesType createTestcasesType() {
        return new TestcasesType();
    }

    /**
     * Create an instance of {@link TestcaseType }
     * 
     */
    public TestcaseType createTestcaseType() {
        return new TestcaseType();
    }

    /**
     * Create an instance of {@link OutputType }
     * 
     */
    public OutputType createOutputType() {
        return new OutputType();
    }

    /**
     * Create an instance of {@link InputType }
     * 
     */
    public InputType createInputType() {
        return new InputType();
    }

}
