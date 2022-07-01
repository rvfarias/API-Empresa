package com.APIEmpresa.APIEmpresa.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Location {

    @Id
    private Long id;
    private String description;
    @ManyToOne
    private LevelAccess levelAccess;

}
