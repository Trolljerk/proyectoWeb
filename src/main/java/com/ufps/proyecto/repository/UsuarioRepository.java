package com.ufps.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufps.proyecto.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByNombreUsuario(String nombreUsuario);
}

