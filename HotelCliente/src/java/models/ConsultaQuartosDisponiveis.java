
package models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaQuartosDisponiveis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaQuartosDisponiveis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaQuartosDisponiveis", propOrder = {
    "data"
})
public class ConsultaQuartosDisponiveis {

    protected long data;

    /**
     * Gets the value of the data property.
     * 
     */
    public long getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     */
    public void setData(long value) {
        this.data = value;
    }

}
