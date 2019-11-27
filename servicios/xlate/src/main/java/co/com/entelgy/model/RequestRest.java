package co.com.entelgy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "newPerson")
//@XmlAccessorType(XmlAccessType.FIELD)
public class RequestRest {

     
	private String name;
    
    
	private String lastName;
    
	
	private String idcc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdcc() {
		return idcc;
	}

	public void setIdcc(String idcc) {
		this.idcc = idcc;
	}
	

}