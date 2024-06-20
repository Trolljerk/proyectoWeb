package com.ufps.proyecto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.ufps.proyecto.entity.Usuario;

@Service
public class UsuarioService {

    @Autowired
    private FirebaseDatabase firebaseDatabase;

    public void save(Usuario usuario) {
        DatabaseReference ref = firebaseDatabase.getReference("admins");
        ref.child(usuario.getNombreUsuario()).setValueAsync(usuario);
    }

    // Dios, no entiendo nada
    // public Usuario findByNombreUsuario(String nombreUsuario) throws ExecutionException, InterruptedException {
    // DatabaseReference ref = firebaseDatabase.getReference("usuarios").child(nombreUsuario);
    // return ref.get().get().getValue(Usuario.class);
    // }
}
