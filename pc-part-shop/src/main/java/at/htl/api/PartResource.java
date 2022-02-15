package at.htl.api;

import at.htl.mapper.GlobalMapper;
import at.htl.workload.parts.*;
import at.htl.model.PartDTO;
import at.htl.workload.parts.logic.PartService;

import javax.ws.rs.*;
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
        Map<String, List<PartDTO>> result = partService.getAll();
        return Response.ok(result).build();
    }

    @GET
    @Path("{serialNumber}")
    public Response getDetails(@PathParam("serialNumber") String serialNumber) {
        var res = partService.getById(serialNumber);
        if (res == null) {
            return Response.status(404).build();
        }
        if (res instanceof Case) {
            return Response.ok(GlobalMapper.INSTANCE.caseToDTO((Case) res)).build();
        }
        if (res instanceof CPU) {
            return Response.ok(GlobalMapper.INSTANCE.cpuToDTO((CPU) res)).build();
        }
        if (res instanceof GraphicsCard) {
            return Response.ok(GlobalMapper.INSTANCE.graphicsCardToDTO((GraphicsCard) res)).build();
        }
        if (res instanceof Motherboard) {
            return Response.ok(GlobalMapper.INSTANCE.motherboardToDTO((Motherboard) res)).build();
        }
        if (res instanceof PSU) {
            return Response.ok(GlobalMapper.INSTANCE.psuToDTO((PSU) res)).build();
        }
        if (res instanceof RAM) {
            return Response.ok(GlobalMapper.INSTANCE.ramToDTO((RAM) res)).build();
        }
        if (res instanceof Storage) {
            return Response.ok(GlobalMapper.INSTANCE.storageToDTO((Storage) res)).build();
        }
        return Response.status(500).build();
    }
}
