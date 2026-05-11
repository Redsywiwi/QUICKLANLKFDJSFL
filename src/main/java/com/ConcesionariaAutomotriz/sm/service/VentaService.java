package com.ConcesionariaAutomotriz.sm.service;
import com.ConcesionariaAutomotriz.sm.model.Venta;
import com.ConcesionariaAutomotriz.sm.repository.VentaRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service

public class VentaService {
    @Autowired private VentaRepository repo;

    public List<Venta> listar() {
        return repo.findAll();
    }

    public Venta guardar(Venta v) { 
        return repo.save(v); 
    }
    
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}