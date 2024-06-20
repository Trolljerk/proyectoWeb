package com.ufps.proyecto.config;

import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;

// TODO: Poner la URL de tu base la base de datos.
@Configuration
public class FirebaseConfig {

    @Bean
    public FirebaseDatabase firebaseDatabase() throws IOException {
        FileInputStream serviceAccount = new FileInputStream("src/main/resources/firebase-service-account.json");

        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://your-database-name.firebaseio.com/")
                .build();

        if (FirebaseApp.getApps().isEmpty()) {
            FirebaseApp.initializeApp(options);
        }

        return FirebaseDatabase.getInstance();
    }
}
