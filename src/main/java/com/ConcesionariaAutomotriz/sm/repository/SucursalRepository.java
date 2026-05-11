package com.ConcesionariaAutomotriz.sm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ConcesionariaAutomotriz.sm.model.Sucursal;
@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Long> {
}