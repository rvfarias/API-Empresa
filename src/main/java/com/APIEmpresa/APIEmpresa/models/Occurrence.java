package com.APIEmpresa.APIEmpresa.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Occurrence {
    @Id
    private long id;
    private String name;
    private String description;
}
