package com.warrieta.forum.forum.alura.api.dto.usuario;

import com.warrieta.forum.forum.alura.api.modelo.Tipo;

public record DatosActualizarUsuario(Long id, String nombre, String email, String contrasena, Tipo tipo) {
}
