package com.api.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AbilityWrapper {

    private Ability ability;

    @JsonProperty("is_hidden")
    private boolean isHidden;
    private int slot;

}
