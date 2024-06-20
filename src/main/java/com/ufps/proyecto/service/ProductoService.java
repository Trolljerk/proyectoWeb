package com.ufps.proyecto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.internal.NonNull;
import com.ufps.proyecto.entity.Producto;

@Service
public class ProductoService {

    @Autowired
    private FirebaseDatabase firebaseDatabase;

    public List<Producto> findAll() throws ExecutionException, InterruptedException {
        DatabaseReference ref = firebaseDatabase.getReference("productos");

        final List<Producto> productos = new ArrayList<>();

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot productSnapshot : snapshot.getChildren()) {
                    Producto producto = productSnapshot.getValue(Producto.class);
                    productos.add(producto);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // TODO: Manejar el error.
            }
        });

        return productos;
    }

    public void save(Producto producto) {
        DatabaseReference ref = firebaseDatabase.getReference("productos");
        ref.push().setValueAsync(producto);
    }
}
