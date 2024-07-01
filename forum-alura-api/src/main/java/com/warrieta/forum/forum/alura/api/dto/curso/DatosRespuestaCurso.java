package com.warrieta.forum.forum.alura.api.dto.curso;

import com.warrieta.forum.forum.alura.api.modelo.Curso;

public record DatosRespuestaCurso(String nombre, String categoria) {

    public DatosRespuestaCurso(Curso curso) {
        this(curso.getNombre(), curso.getCategoria());
    }
}
