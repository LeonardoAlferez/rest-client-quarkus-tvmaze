package org.lalferez.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URL;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TvSeries {
    private Long id ;
    private URL url ;
    private String summary;
    private String language;

    private Set<String> genres;
    private URL officialSite;

}
