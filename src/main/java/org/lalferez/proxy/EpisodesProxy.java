package org.lalferez.proxy;

import org.lalferez.model.Episodes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/shows")
@Produces(MediaType.APPLICATION_JSON)
public interface EpisodesProxy {

    @GET
    @Path("/{id}/episodes")
    List<Episodes> get(@PathParam("id")Long id);

}
