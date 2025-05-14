package com.perfulandia.cl.perfulandia_spa.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    private int id;
    private String nombre;
    private String correo;
    private String contraseña;
}
