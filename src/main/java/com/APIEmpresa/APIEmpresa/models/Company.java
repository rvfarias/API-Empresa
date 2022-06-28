package com.APIEmpresa.APIEmpresa.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Company {

    public long id;
    private String description;
    private String cnpj;
    private String address;
    private String city;
    private String state;
    private String telephone;

}
