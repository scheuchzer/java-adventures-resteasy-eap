package com.ja.eap.resteasy.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("ping")
public interface Ping {

	@GET
	@Path("/")
	public String ping();
	
	
}
