package com.ufps.proyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
//Edwin no hizo una monda
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/evento")
    public String evento() {
        return "evento";
    }

    @GetMapping("/merch")
    public String merch() {
        return "merch";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/buscador")
    public String buscador() {
        return "buscador";
    }

    @GetMapping("/producto")
    public String producto() {
        return "producto";
    }
    
    
    @GetMapping("/info_evento")
    public String info_evento() {
        return "info_evento";
    }

    @GetMapping("/evento_admin")
    public String evento_admin() {
        return "evento_admin";
    }

    @GetMapping("/merch_admin")
    public String merch_admin() {
        return "merch_admin";
    }

    
    @GetMapping("/nuevo_producto")
    public String nuevo_producto() {
        return "nuevo_producto";
    }

    @GetMapping("/nueva_publicacion")
    public String nueva_publicacion() {
        return "nueva_publicacion";
    }
}
