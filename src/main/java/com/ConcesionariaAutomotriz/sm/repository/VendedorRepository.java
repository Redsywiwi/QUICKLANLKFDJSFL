package com.ConcesionariaAutomotriz.sm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ConcesionariaAutomotriz.sm.model.Vendedor;
@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
}