package com.api.domain.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private String name;
    private String url;
    private List<VersionDetail> versionDetails;
}
