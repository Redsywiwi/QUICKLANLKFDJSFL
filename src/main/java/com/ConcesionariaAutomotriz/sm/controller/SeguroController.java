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

import com.ConcesionariaAutomotriz.sm.model.Seguro;
import com.ConcesionariaAutomotriz.sm.service.SeguroService;
@RestController
@RequestMapping("/api/seguros")
public class SeguroController {
    @Autowired private SeguroService service;
    @GetMapping public List<Seguro> listar() { return service.listar(); }
    @PostMapping public ResponseEntity<Seguro> guardar(@RequestBody Seguro s) {
        return ResponseEntity.status(201).body(service.guardar(s));
    }
    @DeleteMapping("/{id}") public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id); return ResponseEntity.noContent().build();
    }
}