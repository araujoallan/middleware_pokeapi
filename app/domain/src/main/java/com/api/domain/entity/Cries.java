package com.api.domain.entity;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cries {

    private String latest;
    private String legacy;
}
