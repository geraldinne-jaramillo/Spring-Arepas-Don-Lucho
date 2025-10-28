package com.example.ArepasDonLucho.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Repartidor")
public class Repartidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  id;

    private String nombre;
    private String documento;
    private String telefono;
    private String placaVehiculo;
    private String zonaCobertura;
    private Boolean activo;

    public Repartidor() {
    }

    public Repartidor(Integer id, String nombre, String documento, String telefono, String placaVehiculo, String zonaCobertura, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.placaVehiculo = placaVehiculo;
        this.zonaCobertura = zonaCobertura;
        this.activo = activo;
    }
    // Relación uno a muchos con Pedido
    @OneToMany(mappedBy = "repartidor")
    private List<Pedido> pedido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getZonaCobertura() {
        return zonaCobertura;
    }

    public void setZonaCobertura(String zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
