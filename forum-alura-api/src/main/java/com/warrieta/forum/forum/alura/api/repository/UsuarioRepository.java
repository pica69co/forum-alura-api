package com.warrieta.forum.forum.alura.api.repository;

import com.warrieta.forum.forum.alura.api.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByEmail(String username);
//    UserDetails findByUsername(String username);
}
