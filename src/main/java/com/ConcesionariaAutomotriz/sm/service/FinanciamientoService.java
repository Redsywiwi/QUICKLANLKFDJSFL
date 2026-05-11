package com.ConcesionariaAutomotriz.sm.service;
import com.ConcesionariaAutomotriz.sm.model.Financiamiento;
import com.ConcesionariaAutomotriz.sm.repository.FinanciamientoRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service


public class FinanciamientoService {
    @Autowired private FinanciamientoRepository repo;

    public List<Financiamiento> listar() {
        return repo.findAll();
    }

    public Financiamiento guardar(Financiamiento f) {
        return repo.save(f);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}