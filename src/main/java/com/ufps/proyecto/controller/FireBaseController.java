package com.ufps.proyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ufps.proyecto.service.FireBaseService;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/firebase")
public class FireBaseController {

    private final FireBaseService firebaseService;

    public FireBaseController(FireBaseService firebaseService) {
        this.firebaseService = firebaseService;
    }

    @GetMapping("/getAll")
    public List<Map<String, Object>> getAllDocuments() throws ExecutionException, InterruptedException {
        return firebaseService.getAllDocuments("admins");
    }
}