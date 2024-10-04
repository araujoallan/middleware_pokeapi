package com.api.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameIndices {

    @JsonProperty("game_index")
    private String gameIndex;
    private Version version;
}
