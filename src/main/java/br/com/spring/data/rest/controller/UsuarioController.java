package br.com.spring.data.rest.controller;

import br.com.spring.data.rest.entity.Usuario;
import br.com.spring.data.rest.repository.UsuarioRepository;
import br.com.spring.data.rest.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com at natanielpaiva.github.io>
 */
@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    UsuarioRepository usuarioRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Usuario> list() {
        return usuarioRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Usuario save(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Usuario update(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }

    /**
     *
     * @param id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        usuarioRepository.delete(id);
    }

}
