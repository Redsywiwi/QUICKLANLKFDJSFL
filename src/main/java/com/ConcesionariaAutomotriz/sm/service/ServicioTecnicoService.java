package com.ConcesionariaAutomotriz.sm.service;
import com.ConcesionariaAutomotriz.sm.model.ServicioTecnico;
import com.ConcesionariaAutomotriz.sm.repository.ServicioTecnicoRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service


public class ServicioTecnicoService {
    @Autowired private ServicioTecnicoRepository repo;

    public List<ServicioTecnico> listar() {
        return repo.findAll();
    }
    
    public ServicioTecnico guardar(ServicioTecnico s) {
        return repo.save(s);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}