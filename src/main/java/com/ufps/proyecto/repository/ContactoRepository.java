package com.ufps.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufps.proyecto.entity.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {
}
