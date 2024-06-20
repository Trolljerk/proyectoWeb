package com.ufps.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Anotaciones de Lombok
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * @Entity: Esta anotación indica que la clase se mapea a una tabla en la base
 * de datos.
 */
@Entity

/**
 * @Table(name = "productos"): Esta anotación especifica el nombre de la tabla
 * en la base de datos donde se mapeará la entidad.
 */
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String precio;

    private String talla;

    private int stock;

    private String descripcion;
}
