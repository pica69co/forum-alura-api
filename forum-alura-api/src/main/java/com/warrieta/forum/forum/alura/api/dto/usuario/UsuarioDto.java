package com.warrieta.forum.forum.alura.api.dto.usuario;

import com.warrieta.forum.forum.alura.api.modelo.Usuario;

public record UsuarioDto(
        Long id,
        String nombre
) {
    public UsuarioDto(Usuario usuario) {
        this(usuario.getId(), usuario.getNombre());
    }
}
