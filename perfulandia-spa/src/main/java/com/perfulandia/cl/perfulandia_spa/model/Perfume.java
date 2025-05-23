package com.perfulandia.cl.perfulandia_spa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Perfume {
    
    private int id;
    private String nombre;
    private String marca;
    private double precio;
    private int tamanio;
    private int stock;
}
