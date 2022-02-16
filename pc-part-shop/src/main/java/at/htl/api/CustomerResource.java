package at.htl.api;

import at.htl.mapper.GlobalMapper;
import at.htl.model.CustomerDTO;
import at.htl.workload.customer.Customer;
import at.htl.workload.customer.logic.CustomerService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("customer")
public class CustomerResource {

   private final CustomerService customerService;

    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }

    @POST
    public Response addCustomer(CustomerDTO customerDTO){
        Customer customer = customerService.add(customerDTO);
        return Response.ok(GlobalMapper.INSTANCE.customerToCustomerDTO(customer)).build();
    }

    @PATCH
    @Path("{customerId}/{pcId}")
    public Response addPcToCustomer(
            @PathParam("customerId") long customerId,
            @PathParam("pcId") long pcId
    ){
        boolean success = customerService.addPcToCustomer(customerId, pcId);
        return (success ? Response.ok() : Response.status(404)).build();
    }

    @GET
    @Path("all")
    public Response getAllCustomer(){
        List<Customer> result = this.customerService.getAllCustomer();
        return ((result == null)? Response.status(404) : Response.ok(GlobalMapper.INSTANCE.listCustomerToDTO(result))).build();
    }

    @GET
    @Path("{id}")
    public Response getCusomterById(@PathParam("id") Long id){
        Customer result = this.customerService.getCustomerById(id);
        return ((result == null)? Response.status(404) : Response.ok(GlobalMapper.INSTANCE.customerToCustomerDTO(result))).build();
    }
}
