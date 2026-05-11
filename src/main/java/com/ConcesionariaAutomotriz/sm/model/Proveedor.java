package com.ConcesionariaAutomotriz.sm.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "proveedores")
@Data
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreEmpresa;
    private String contacto;
}