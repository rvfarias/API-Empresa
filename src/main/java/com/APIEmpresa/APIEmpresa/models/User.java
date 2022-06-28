package com.APIEmpresa.APIEmpresa.models;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {
    private Long id;
    private String name;
    private BigDecimal tolerance;
    private LocalDateTime startTrip;
    private LocalDateTime endTrip;
}
