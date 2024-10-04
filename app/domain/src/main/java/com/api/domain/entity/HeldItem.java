package com.api.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HeldItem {

    private Item item;

    @JsonProperty("version_details")
    private List<VersionDetail> versionDetails;
}
