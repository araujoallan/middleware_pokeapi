package com.api.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MoveWrapper {

    private Move move;

    @JsonProperty("version_group_details")
    private List<VersionGroupDetails> versionGroupDetails;

}
