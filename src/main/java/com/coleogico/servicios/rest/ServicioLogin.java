package com.coleogico.servicios.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;


/**
 * 
 * @author Camilo
 * @since  07/07/2018
 */
@Path("/login")
public class ServicioLogin {

	JSONObject t = new JSONObject();
	
	
	
	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public String validarUsuario() {
		JSONObject retorno = new JSONObject();
		retorno.put("mensaje", "OK");
		
		return retorno.toString();
	}
	
}
