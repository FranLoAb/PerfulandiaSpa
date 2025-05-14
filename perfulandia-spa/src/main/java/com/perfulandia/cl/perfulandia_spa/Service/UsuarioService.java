package com.perfulandia.cl.perfulandia_spa.Service;

import com.perfulandia.cl.perfulandia_spa.Models.Usuario;
import com.perfulandia.cl.perfulandia_spa.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios() {
        return usuarioRepository.obtenerUsuarios();
    }

    public Usuario getUsuarioById(int id) {
        return usuarioRepository.buscarPorId(id);
    }

    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.guardar(usuario);
    }

    public Usuario updateUsuario(Usuario usuario) {
        return usuarioRepository.actualizar(usuario);
    }

    public String deleteUsuario(int id) {
        usuarioRepository.eliminar(id);
        return "Usuario eliminado con ID: " + id;
    }
}