package br.edu.univas.si8.ta.shopping.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rest")
public interface ClientService {
	
	@GET
	@Path("/order/all")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listOrders();

	@POST
	@Path("/order/add")
	@Produces(MediaType.APPLICATION_JSON)
	String addOrder(@FormParam("description") String description);
}
