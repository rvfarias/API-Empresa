package com.APIEmpresa.APIEmpresa.models;

import lombok.*;
import org.hibernate.type.SerializableType;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class MovementId implements Serializable {
        private long idMovement;
        private long idUser;
    }
    @Id @EmbeddedId
    private MovementId id;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private BigDecimal period;
    @OneToOne
    private Occurrence occurrence;
    @OneToOne
    private Calendar calendar;

}
