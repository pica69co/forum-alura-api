package com.warrieta.forum.forum.alura.api.repository;

import com.warrieta.forum.forum.alura.api.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
