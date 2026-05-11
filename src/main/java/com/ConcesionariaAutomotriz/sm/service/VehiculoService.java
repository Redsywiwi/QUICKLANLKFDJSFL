package com.ConcesionariaAutomotriz.sm.service;
import com.ConcesionariaAutomotriz.sm.model.Vehiculo;
import com.ConcesionariaAutomotriz.sm.repository.VehiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service


public class VehiculoService {
    @Autowired private VehiculoRepository repo;

    public List<Vehiculo> listar() {
        return repo.findAll();
    }

    public Vehiculo guardar(Vehiculo v) {
        return repo.save(v);
    }
    
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}