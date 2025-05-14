package com.perfulandia.cl.perfulandia_spa.Repository;

import com.perfulandia.cl.perfulandia_spa.Models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    private List<Usuario> listaUsuarios = new ArrayList<>();

    public List<Usuario> obtenerUsuarios() {
        return listaUsuarios;
    }

    public Usuario buscarPorId(int id) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public Usuario guardar(Usuario usuario) {
        listaUsuarios.add(usuario);
        return usuario;
    }

    public Usuario actualizar(Usuario usuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getId() == usuario.getId()) {
                listaUsuarios.set(i, usuario);
                return usuario;
            }
        }
        return null;
    }

    public void eliminar(int id) {
        Usuario usuario = buscarPorId(id);
        if (usuario != null) {
            listaUsuarios.remove(usuario);
        }
    }
}
