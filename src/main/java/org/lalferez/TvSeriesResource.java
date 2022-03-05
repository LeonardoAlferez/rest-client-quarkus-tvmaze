package org.lalferez;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.lalferez.model.Episodes;
import org.lalferez.model.TvSeries;
import org.lalferez.proxy.EpisodesProxy;
import org.lalferez.proxy.TvSeriesProxy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/tvseries")
public class TvSeriesResource {


    @RestClient
    TvSeriesProxy tvSeriesProxy;

    @RestClient
    EpisodesProxy episodesProxy;

    private List<TvSeries> tvSeriesList = new ArrayList();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@QueryParam("title") String title){
        TvSeries tvSeries = tvSeriesProxy.get(title);
        List<Episodes> episodes = episodesProxy.get(tvSeries.getId());
        return Response.ok(episodes).build();
    }
}
