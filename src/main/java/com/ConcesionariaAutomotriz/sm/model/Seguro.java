package com.ConcesionariaAutomotriz.sm.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "seguros")
@Data
public class Seguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String compania;
    private String tipoPoliza;
}