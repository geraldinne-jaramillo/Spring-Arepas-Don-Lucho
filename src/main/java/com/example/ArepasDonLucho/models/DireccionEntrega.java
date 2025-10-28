package com.example.ArepasDonLucho.models;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_direccionEntrega")



public class DireccionEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ciudad;
    private String barrio;
    private String direccionTexto;
    private String referencia;

    @OneToOne(mappedBy = "direccionEntrega")
    private Cliente cliente;

    public DireccionEntrega(Integer id, String ciudad, String barrio, String direccionTexto, String referencia, Cliente cliente) {
        this.id = id;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.direccionTexto = direccionTexto;
        this.referencia = referencia;
        this.cliente = cliente;
    }

    public DireccionEntrega() {
    }

    public Integer getId() {
        return id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getDireccionTexto() {
        return direccionTexto;
    }

    public String getReferencia() {
        return referencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setDireccionTexto(String direccionTexto) {
        this.direccionTexto = direccionTexto;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
