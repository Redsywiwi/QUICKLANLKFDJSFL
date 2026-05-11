package com.ConcesionariaAutomotriz.sm.service;
import com.ConcesionariaAutomotriz.sm.model.Proveedor;
import com.ConcesionariaAutomotriz.sm.repository.ProveedorRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service


public class ProveedorService {
    @Autowired private ProveedorRepository repo;

    public List<Proveedor> listar() {
        return repo.findAll();
    }

    public Proveedor guardar(Proveedor p) {
        return repo.save(p);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}