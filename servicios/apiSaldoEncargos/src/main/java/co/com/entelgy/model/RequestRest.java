package co.com.entelgy.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class RequestRest {

    @NotNull(message = "not null")
    @NotEmpty(message = "not nul")
    @Size(max = 4000, message = "4000 caracteres")
	private String name;
    
    @NotNull(message = "not null")
    @NotEmpty(message = "not null")
    @Size(max = 4000, message = " 4000 caracteres")
	private String lastName;
    
	@NotNull(message = "not null")
    @NotEmpty(message = "not null")
	@Size(max = 4000, message = " 4000 caracteres")
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