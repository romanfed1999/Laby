package lab;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("Lawyers")
public class LawFirmService {
	private static Map<Integer, Lawyer> lawyers = new HashMap<>();

@GET
@Path("/{id}")
@Produces(MediaType.APPLICATION_JSON)
public Lawyer getGood(@PathParam("id") Integer id) {
    return lawyers.get(id);
	}
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createGood(Lawyer lawyer) {
        lawyers.put(lawyer.getId(), lawyer);
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void replaceGood(Lawyer lawyer) {
        lawyers.replace(lawyer.getId(), lawyer);
    }
    
    @DELETE
    @Path("/{id}")
    public void deleteGood(@PathParam("id") Integer position) {
        lawyers.remove(position);
}
}
