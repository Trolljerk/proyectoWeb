package com.ufps.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ufps.proyecto.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
