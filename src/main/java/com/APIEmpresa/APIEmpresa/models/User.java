package com.APIEmpresa.APIEmpresa.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class User {
    @Id
    private Long id;
    private String name;
    private BigDecimal tolerance;
    private LocalDateTime startTrip;
    private LocalDateTime endTrip;
    @ManyToOne
    private Company company;
    @ManyToOne
    private LevelAccess levelAccess;
    @ManyToOne
    private WorkingDay workingDay;
    @ManyToOne
    private UserType userType;

}
