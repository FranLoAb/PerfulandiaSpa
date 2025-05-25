package com.perfulandia.cl.perfulandia_spa.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String producto;
    private int cantidad;
    private double precioUnitario;

    @ManyToOne
    @JoinColumn(name = "usuario_id") 
    private Usuario usuario;

    public double getTotal() {
        return cantidad * precioUnitario;
    }
}
