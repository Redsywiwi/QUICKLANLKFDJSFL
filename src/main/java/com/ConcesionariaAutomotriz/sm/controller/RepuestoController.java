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

import com.ConcesionariaAutomotriz.sm.model.Repuesto;
import com.ConcesionariaAutomotriz.sm.service.RepuestoService;
@RestController
@RequestMapping("/api/repuestos")
public class RepuestoController {
    @Autowired private RepuestoService service;
    @GetMapping public List<Repuesto> listar() { return service.listar(); }
    @PostMapping public ResponseEntity<Repuesto> guardar(@RequestBody Repuesto r) {
        return ResponseEntity.status(201).body(service.guardar(r));
    }
    @DeleteMapping("/{id}") public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id); return ResponseEntity.noContent().build();
    }
}