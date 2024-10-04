package com.api.restapi.adapters.input.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FindPokemonRequest {

    @NotEmpty
    private String name;
}
