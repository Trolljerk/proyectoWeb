package com.ufps.proyecto.model;

import lombok.Data;

/**
 * Anotación de Lombok
 */
@Data
public class ContactoDTO {

    private String nombre;

    private String email;

    private String asunto;

    private String mensaje;

}
