package com.ConcesionariaAutomotriz.sm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ConcesionariaAutomotriz.sm.model.ServicioTecnico;
@Repository
public interface ServicioTecnicoRepository extends JpaRepository<ServicioTecnico, Long> {
}