package com.ConcesionariaAutomotriz.sm.service;
import com.ConcesionariaAutomotriz.sm.model.Seguro;
import com.ConcesionariaAutomotriz.sm.repository.SeguroRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service


public class SeguroService {
    @Autowired private SeguroRepository repo;

    public List<Seguro> listar() {
        return repo.findAll();
    }

    public Seguro guardar(Seguro s) {
        return repo.save(s);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}