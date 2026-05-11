package com.ConcesionariaAutomotriz.sm.service;
import com.ConcesionariaAutomotriz.sm.model.Sucursal;
import com.ConcesionariaAutomotriz.sm.repository.SucursalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service

public class SucursalService {
    @Autowired private SucursalRepository repo;

    public List<Sucursal> listar() {
        return repo.findAll();
    }
    
    public Sucursal guardar(Sucursal s) {
        return repo.save(s);
    }
    
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}