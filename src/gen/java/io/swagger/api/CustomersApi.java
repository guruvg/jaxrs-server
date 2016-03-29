package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CustomersApiService;
import io.swagger.api.factories.CustomersApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.CustomerResponse;
import io.swagger.model.ErrorResponse;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/customers")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the customers API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-03-28T11:26:27.512Z")
public class CustomersApi  {
   private final CustomersApiService delegate = CustomersApiServiceFactory.getCustomersApi();

    @GET
    @Path("/{customerId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a specific customer by Id", notes = "Get a specific customer by Id", response = CustomerResponse.class, tags={ "customers" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Response for resource retrieved", response = CustomerResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Error", response = CustomerResponse.class) })

    public Response customers(
@ApiParam(value = "API Key to call the API" ,required=true)@HeaderParam("apikey") String apikey,
@ApiParam(value = "Unique Id of the customer to fetch",required=true) @PathParam("customerId") String customerId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.customers(apikey,customerId,securityContext);
    }
}
