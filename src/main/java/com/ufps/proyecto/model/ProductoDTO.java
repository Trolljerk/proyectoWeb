package com.ufps.proyecto.model;

import lombok.Data;

/**
 * Anotación de Lombok
 */
@Data
public class ProductoDTO {

    private String nombre;

    private String precio;

    private String talla;

    private int stock;

    private String descripcion;

}
