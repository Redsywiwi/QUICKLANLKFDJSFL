package com.ConcesionariaAutomotriz.sm.service;
import com.ConcesionariaAutomotriz.sm.model.Repuesto;
import com.ConcesionariaAutomotriz.sm.repository.RepuestoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service


public class RepuestoService {
    @Autowired private RepuestoRepository repo;

    public List<Repuesto> listar() {
        return repo.findAll();
    }

    public Repuesto guardar(Repuesto r) {
        return repo.save(r);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}