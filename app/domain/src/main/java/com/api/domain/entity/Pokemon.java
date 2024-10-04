package com.api.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {

    private String name;

    private List<AbilityWrapper> abilities;

    private Cries cries;

    @JsonProperty("base_experience")
    private String baseExperience;

    private List<PokemonForm> forms;

    @JsonProperty("game_indices")
    private List<GameIndices> gameIndices;

    private int height;

    @JsonProperty("held_items")
    private List<HeldItem> heldItems;

    private int id;

    @JsonProperty("is_default")
    private boolean isDefault;

    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters;

    private List<MoveWrapper> moves;

    private int order;
}
