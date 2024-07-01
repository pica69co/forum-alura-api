package com.warrieta.forum.forum.alura.api.dto.respuesta;

import com.warrieta.forum.forum.alura.api.dto.topico.DatosRespuestaTopico;
import com.warrieta.forum.forum.alura.api.dto.usuario.DatosRespuestaUsuario;
import com.warrieta.forum.forum.alura.api.modelo.Respuesta;

public record DatosRetornoRespuestaId(String mensaje, DatosRespuestaTopico topico, String fechaCreacion, DatosRespuestaUsuario autor, String solucion) {

    public DatosRetornoRespuestaId(Respuesta respuesta) {
        this(respuesta.getMensaje(), new DatosRespuestaTopico(respuesta.getTopico()), respuesta.getFechaCreacion().toString(),
                new DatosRespuestaUsuario(respuesta.getAutor()), respuesta.getSolucion().toString());
    }
}
