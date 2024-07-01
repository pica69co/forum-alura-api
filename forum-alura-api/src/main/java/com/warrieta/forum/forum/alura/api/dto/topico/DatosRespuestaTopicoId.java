package com.warrieta.forum.forum.alura.api.dto.topico;

import com.warrieta.forum.forum.alura.api.dto.curso.DatosRespuestaCurso;
import com.warrieta.forum.forum.alura.api.dto.usuario.DatosRespuestaUsuario;
import com.warrieta.forum.forum.alura.api.modelo.Topico;

public record DatosRespuestaTopicoId(Long id, String titulo, String mensaje, String fechaCreacion, String estado, DatosRespuestaUsuario autor,
                                     DatosRespuestaCurso curso) {

    public DatosRespuestaTopicoId(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion().toString(),
                topico.getEstado().toString(), new DatosRespuestaUsuario(topico.getAutor()),
                new DatosRespuestaCurso(topico.getCurso()));
    }
}
