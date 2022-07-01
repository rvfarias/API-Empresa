package com.APIEmpresa.APIEmpresa.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Calendar {
    @Id
    private Long id;
    @OneToOne
    private DateType dateType;
    private String description;
    private LocalDateTime specialDate;

}

