package com.eventostech.api.domain.coupom;

import com.eventostech.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "event-coupon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Coupom {

    @Id
    @GeneratedValue

    private UUID id;

    private String code;
    private Integer discount;
    private Date valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;





}
