package demo.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/payment")
public class PaymentRestController {

    @GET
    @Produces("application/json")
    public String payment(){
        return "{\"transactionId\": \"77412\"}";
    }
}
