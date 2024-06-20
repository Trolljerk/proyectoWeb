package com.ufps.proyecto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.proyecto.entity.Contacto;
import com.ufps.proyecto.repository.ContactoRepository;

@Service
public class ContactoService {

    @Autowired
    private ContactoRepository contactoRepository;

    public List<Contacto> findAll() {
        return contactoRepository.findAll();
    }

    public Contacto save(Contacto contacto) {
        return contactoRepository.save(contacto);
    }
}
