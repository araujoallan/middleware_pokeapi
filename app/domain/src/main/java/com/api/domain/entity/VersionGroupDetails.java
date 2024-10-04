package com.api.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VersionGroupDetails {

    @JsonProperty("level_learned_at")
    private int levelLearnedAt;

    @JsonProperty("move_learn_method")
    private MoveLearnedMethod moveLearnMethod;

    @JsonProperty("version_group")
    private VersionGroup versionGroup;
}
