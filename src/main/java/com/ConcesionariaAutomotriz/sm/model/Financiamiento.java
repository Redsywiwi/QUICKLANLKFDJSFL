package com.ConcesionariaAutomotriz.sm.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "financiamientos")
@Data
public class Financiamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String banco;
    private Integer cuotas;
}