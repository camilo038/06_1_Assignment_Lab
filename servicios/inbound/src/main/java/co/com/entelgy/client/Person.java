package co.com.entelgy.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {

	private String moviCtcoNegocio;
	private String moviCtcoCiasNego;
	private String moviEncargo;
	
	public String getMoviCtcoNegocio() {
		return moviCtcoNegocio;
	}
	public void setMoviCtcoNegocio(String moviCtcoNegocio) {
		this.moviCtcoNegocio = moviCtcoNegocio;
	}
	public String getMoviCtcoCiasNego() {
		return moviCtcoCiasNego;
	}
	public void setMoviCtcoCiasNego(String moviCtcoCiasNego) {
		this.moviCtcoCiasNego = moviCtcoCiasNego;
	}
	public String getMoviEncargo() {
		return moviEncargo;
	}
	public void setMoviEncargo(String moviEncargo) {
		this.moviEncargo = moviEncargo;
	}
	

}
