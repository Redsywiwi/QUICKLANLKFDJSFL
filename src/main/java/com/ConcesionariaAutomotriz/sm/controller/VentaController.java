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

import com.ConcesionariaAutomotriz.sm.model.Venta;
import com.ConcesionariaAutomotriz.sm.service.VentaService;
@RestController
@RequestMapping("/api/ventas")
public class VentaController {
    @Autowired private VentaService service;
    @GetMapping public List<Venta> listar() { return service.listar(); }
    @PostMapping public ResponseEntity<Venta> guardar(@RequestBody Venta v) {
        return ResponseEntity.status(201).body(service.guardar(v));
    }
    @DeleteMapping("/{id}") public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id); return ResponseEntity.noContent().build();
    }
}