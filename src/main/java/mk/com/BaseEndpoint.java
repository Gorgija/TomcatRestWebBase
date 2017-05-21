/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mk.com;

import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author georgy
 */


@Path("base")
public class BaseEndpoint {
    
    
    @GET
    public Response ping() {
        return Response.ok().entity("Response is 200 / OK at " + new Date()).build();
    }
    
    
}
