package com.perfulandia.cl.perfulandia.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table(name = "ticketsoporte")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TicketSoporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique=true, length = 13, nullable = false)
    private String run;

    @Column(nullable = false)
    private String numeroTicket;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String correo;

}
