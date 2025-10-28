package com.example.ArepasDonLucho.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombres;
    @Column(nullable = false)
    private String tipoDocumento;
    @Column(nullable = false)
    private String documento;
    private String telefono;
    private String email;

    @OneToOne
    @JoinColumn(name = "fk_idCliente", referencedColumnName = "id")
    private DireccionEntrega direccionEntrega;

    public Cliente() {
    }

    public Cliente(Integer id, String nombres, String tipoDocumento, String documento, String telefono, String email, DireccionEntrega direccionEntrega) {
        this.id = id;
        this.nombres = nombres;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.telefono = telefono;
        this.email = email;
        this.direccionEntrega = direccionEntrega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DireccionEntrega getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(DireccionEntrega direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }
}
