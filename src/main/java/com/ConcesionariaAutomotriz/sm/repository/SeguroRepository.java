package com.ConcesionariaAutomotriz.sm.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ConcesionariaAutomotriz.sm.model.Seguro;
@Repository
public interface SeguroRepository extends JpaRepository<Seguro, Long> {
}