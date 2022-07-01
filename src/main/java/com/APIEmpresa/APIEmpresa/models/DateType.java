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

public class DateType {
    @Id
    private long id;
    private String description;
}
