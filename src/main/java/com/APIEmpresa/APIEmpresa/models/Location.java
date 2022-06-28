package com.APIEmpresa.APIEmpresa.models;

import lombok.*;

import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Location {
    private Long id;
    @OneToMany
    private String description;
    private LevelAccess levelAccess;

}
