package com.ufps.proyecto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String email;

    private String asunto;

    private String mensaje;

}
