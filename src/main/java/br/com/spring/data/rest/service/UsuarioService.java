package br.com.spring.data.rest.service;

import br.com.spring.data.rest.entity.Usuario;
import br.com.spring.data.rest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com at natanielpaiva.github.io>
 */
@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
