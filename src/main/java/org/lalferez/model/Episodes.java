package org.lalferez.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Episodes {

    private Long id;
    private String name;
    private Long season;
    private String summary;

}
