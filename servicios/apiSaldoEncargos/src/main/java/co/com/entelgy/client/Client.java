package co.com.entelgy.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.camel.Body;

import co.com.entelgy.model.RequestRest;
/**
 * 
 * @author Camilo Camargo
 *
 */
@Path("/")
public interface Client {

	@POST
	@Path("/personValidation")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void validacionSaldo(@Body RequestRest body);

}