package com.usa.palcosapp_1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservation")
@NoArgsConstructor
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date starDate;
    private Date devolutionDate;
    private String status="created";

    @ManyToOne
    @JoinColumn(name = "id")
    @JsonIgnoreProperties("reservations")
    private Box box;

    @ManyToOne
    @JoinColumn(name = "idClient")
    @JsonIgnoreProperties({"reservations_messages"})
    private Client client;
    private  String score;
}
