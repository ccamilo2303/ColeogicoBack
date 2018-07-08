package com.coleogico.configuraciones;

import org.glassfish.jersey.server.ResourceConfig;

public class ColeogicoConfig extends ResourceConfig {
	
	    public ColeogicoConfig() {
	        // Define the package which contains the service classes.
	        packages("com.coleogico.servicios.rest");
	    }
}
