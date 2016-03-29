package io.swagger.api.impl;

import io.swagger.api.ApiResponseMessage;
import io.swagger.api.CustomersApiService;
import io.swagger.api.NotFoundException;
import io.swagger.model.GmfCustomer;

import java.util.Date;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-03-28T11:26:27.512Z")
public class CustomersApiServiceImpl extends CustomersApiService {

	@Override
	public Response customers(String apikey, String customerId,
			SecurityContext securityContext) throws NotFoundException {
		// do some magic!
		// GmfCustomer customer = new GmfCustomer();
		// customer.setCustomerId(customerId);
		// customer.setDob(new Date());
		// customer.setFirstName("Jim");
		// customer.setLastName("Jen");
		// return Response.ok(customer).build();
		return Response
				.ok()
				.entity(new ApiResponseMessage(ApiResponseMessage.OK, "Magic!"))
				.build();
	}
}
