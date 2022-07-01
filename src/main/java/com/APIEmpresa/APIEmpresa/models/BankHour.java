package com.APIEmpresa.APIEmpresa.models;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BankHour {

    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class BankHourId implements Serializable{
        private long idBankHour;
        private long idMovement;
        private long idUser;

    }
    @Id @EmbeddedId
    private BankHourId id;
    private LocalDateTime workDate;
    private BigDecimal quantHours;
    private BigDecimal scoreHours;
}
