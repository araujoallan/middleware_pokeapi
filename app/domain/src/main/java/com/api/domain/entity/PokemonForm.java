package com.api.domain.entity;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PokemonForm {

    private String name;
    private String url;
}
