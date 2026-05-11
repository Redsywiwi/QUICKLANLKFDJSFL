package com.ConcesionariaAutomotriz.sm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ConcesionariaAutomotriz.sm.model.Proveedor;
@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
}