package com.warrieta.forum.forum.alura.api.dto.topico;

import com.warrieta.forum.forum.alura.api.modelo.Topico;

public record DatosRespuestaTopico(String titulo, String mensaje, String autor, String curso) {

    public DatosRespuestaTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getAutor().getNombre(), topico.getCurso().getNombre());
    }
}
