package com.warrieta.forum.forum.alura.api.config.security;

import com.warrieta.forum.forum.alura.api.dto.usuario.DatosRegistroUsuario;
import com.warrieta.forum.forum.alura.api.dto.usuario.UsuarioDto;
import com.warrieta.forum.forum.alura.api.modelo.Usuario;
import com.warrieta.forum.forum.alura.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AutenticacionService implements UserDetailsService {

    @Autowired
    private final UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRepository.findByEmail(username);
    }

    public UsuarioDto registrarUsuario(Usuario usuario) {
        try {
            String hashedPassword = passwordEncoder.encode(usuario.getPassword());
            usuario.setPassword(hashedPassword);
            var  newUsuario = usuarioRepository.save(usuario);
            return new UsuarioDto(newUsuario);
        } catch (DataIntegrityViolationException ex) {
            throw new RuntimeException("Error al registrar usuario");
        }
    }

//    public Boolean validateUsername(String username) {
//        var foundUser = usuarioRepository.findByUsername(username);
//        if(foundUser != null) {
//            return true;
//        } else {
//            return false;
//        }
//    }


  public  AutenticacionService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
}
