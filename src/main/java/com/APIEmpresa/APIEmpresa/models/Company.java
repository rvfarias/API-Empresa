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
public class Company {

    @Id
    public long id;
    private String description;
    private String cnpj;
    private String address;
    private String city;
    private String state;
    private String telephone;

}
