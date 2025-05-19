package com.perfulandia.cl.perfulandia_spa.Repository;

import com.perfulandia.cl.perfulandia_spa.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
