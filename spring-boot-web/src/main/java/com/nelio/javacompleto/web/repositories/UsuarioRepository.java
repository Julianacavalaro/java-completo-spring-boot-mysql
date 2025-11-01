package com.nelio.javacompleto.web.repositories;

import com.nelio.javacompleto.web.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository para Usuario - Spring Data JPA
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
