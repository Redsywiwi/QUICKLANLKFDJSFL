package com.ConcesionariaAutomotriz.sm.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ConcesionariaAutomotriz.sm.model.Vendedor;
import com.ConcesionariaAutomotriz.sm.service.VendedorService;
@RestController
@RequestMapping("/api/vendedores")
public class VendedorController {
    @Autowired private VendedorService service;
    @GetMapping public List<Vendedor> listar() { return service.listar(); }
    @PostMapping public ResponseEntity<Vendedor> guardar(@RequestBody Vendedor v) {
        return ResponseEntity.status(201).body(service.guardar(v));
    }
    @DeleteMapping("/{id}") public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id); return ResponseEntity.noContent().build();
    }
}