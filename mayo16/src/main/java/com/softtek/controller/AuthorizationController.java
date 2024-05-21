package com.softtek.controller;

import com.softtek.dao.response.Contenido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/resource")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthorizationController {
    @GetMapping
    public ResponseEntity<Contenido> sayHello() {
        return ResponseEntity.ok(Contenido.builder().contenido("Here is your resource").build());
    }

}
