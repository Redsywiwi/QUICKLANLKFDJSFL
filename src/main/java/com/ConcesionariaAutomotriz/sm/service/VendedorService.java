package com.ConcesionariaAutomotriz.sm.service;
import com.ConcesionariaAutomotriz.sm.model.Vendedor;
import com.ConcesionariaAutomotriz.sm.repository.VendedorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service

public class VendedorService {
    @Autowired private VendedorRepository repo;

    public List<Vendedor> listar() {
        return repo.findAll(); 
    }
    
    public Vendedor guardar(Vendedor v) { 
        return repo.save(v); 
    }
    
    public void eliminar(Long id) {
        repo.deleteById(id); 
    }
}