package com.ConcesionariaAutomotriz.sm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ConcesionariaAutomotriz.sm.model.Vehiculo;
import java.util.List;
@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    List<Vehiculo> findByMarca(String marca);
    List<Vehiculo> findByModeloContaining(String modelo);
}