package at.htl.api;

import at.htl.workload.parts.PartDto;
import at.htl.workload.parts.logic.PartService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("part")
public class PartResource {
    private final PartService partService;

    public PartResource(PartService partService) {
        this.partService = partService;
    }

    @GET
    public Response getAll(){
        Map<String, List<PartDto>> result = partService.getAll();
        return Response.ok(result).build();
    }
}
