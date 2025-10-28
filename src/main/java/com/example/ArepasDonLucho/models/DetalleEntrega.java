package com.example.ArepasDonLucho.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "Tbl_DetalleEntrega")
public class DetalleEntrega {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (nullable = false)
    private LocalDate horaSalidaCocina;
    @Column (nullable = false)
    private LocalDate horaEntregaCliente;
    @Column (length = 50, nullable = false)
    private String estado;
    @Column (nullable = false)
    private String fotoPrueba;
    private boolean intentoFallido;

    @OneToOne
    @JoinColumn (name = "Fk_pedido", referencedColumnName = "id")
    private Pedido pedido;

    public DetalleEntrega() {
    }

    public DetalleEntrega(Integer id, LocalDate horaSalidaCocina, LocalDate horaEntregaCliente, String estado,
     String fotoPrueba, boolean intentoFallido, Pedido pedido) {
        this.id = id;
        this.horaSalidaCocina = horaSalidaCocina;
        this.horaEntregaCliente = horaEntregaCliente;
        this.estado = estado;
        this.fotoPrueba = fotoPrueba;
        this.intentoFallido = intentoFallido;
        this.pedido = pedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getHoraSalidaCocina() {
        return horaSalidaCocina;
    }

    public void setHoraSalidaCocina(LocalDate horaSalidaCocina) {
        this.horaSalidaCocina = horaSalidaCocina;
    }

    public LocalDate getHoraEntregaCliente() {
        return horaEntregaCliente;
    }

    public void setHoraEntregaCliente(LocalDate horaEntregaCliente) {
        this.horaEntregaCliente = horaEntregaCliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFotoPrueba() {
        return fotoPrueba;
    }

    public void setFotoPrueba(String fotoPrueba) {
        this.fotoPrueba = fotoPrueba;
    }

    public boolean isIntentoFallido() {
        return intentoFallido;
    }

    public void setIntentoFallido(boolean intentoFallido) {
        this.intentoFallido = intentoFallido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
