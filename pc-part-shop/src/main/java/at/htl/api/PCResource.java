package at.htl.api;

import at.htl.mapper.GlobalMapper;
import at.htl.model.NewPCDTO;
import at.htl.workload.pc.ConfiguredPC;
import at.htl.workload.pc.logic.PCService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("pc")
public class PCResource {
    private final PCService pcService;

    public PCResource(PCService pcService) {
        this.pcService = pcService;
    }


    @Path("prebuilt")
    @GET
    public Response getAllPrebuilt(){
        return Response.ok(GlobalMapper.INSTANCE.listPrebuiltPCToDTO(pcService.getAllPrebuilt())).build();
    }

    @Path("configured")
    @GET
    public Response getAllConfigured(){
        return Response.ok(GlobalMapper.INSTANCE.listConfiguredPcToDTO(pcService.getAllConfigured())).build();
    }

    @POST
    public Response configurePC(NewPCDTO dto){
        ConfiguredPC configuredPC =  pcService.configurePC(dto);
        return (configuredPC == null ? Response.status(400) : Response.ok(GlobalMapper.INSTANCE.configuredPCToDTO(configuredPC))).build();
    }
}
