package com.ConcesionariaAutomotriz.sm.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "repuestos")
@Data
public class Repuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Integer stock;
    private Double precio;
}