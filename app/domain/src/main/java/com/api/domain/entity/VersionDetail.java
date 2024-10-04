package com.api.domain.entity;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VersionDetail {

    private String rarity;
    private Version version;
}
