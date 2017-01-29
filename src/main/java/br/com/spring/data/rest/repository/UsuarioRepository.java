package br.com.spring.data.rest.repository;

import br.com.spring.data.rest.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com at natanielpaiva.github.io>
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
