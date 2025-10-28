package com.example.ArepasDonLucho.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pedido")
public class Pedido {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Integer codigo;
        private LocalDate fechaCreacion;
        private Boolean estado;
        private short totalItems;
        private Integer valorTotal;

        @OneToOne(mappedBy = "pk_pedido")
        private DetalleEntrega detalleEntrega;

        @ManyToOne
        @JoinColumn(name = "repartidor")
        private Repartidor repartidor;

        public Pedido() {
        }

        public Pedido(Integer id, Integer codigo, LocalDate fechaCreacion, Boolean estado, short totalItems, Integer valorTotal) {
            this.id = id;
            this.codigo = codigo;
            this.fechaCreacion = fechaCreacion;
            this.estado = estado;
            this.totalItems = totalItems;
            this.valorTotal = valorTotal;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getCodigo() {
            return codigo;
        }

        public void setCodigo(Integer codigo) {
            this.codigo = codigo;
        }

        public LocalDate getFechaCreacion() {
            return fechaCreacion;
        }

        public void setFechaCreacion(LocalDate fechaCreacion) {
            this.fechaCreacion = fechaCreacion;
        }

        public Boolean getEstado() {
            return estado;
        }

        public void setEstado(Boolean estado) {
            this.estado = estado;
        }

        public short getTotalItems() {
            return totalItems;
        }

        public void setTotalItems(short totalItems) {
            this.totalItems = totalItems;
        }

        public Integer getValorTotal() {
            return valorTotal;
        }

        public void setValorTotal(Integer valorTotal) {
            this.valorTotal = valorTotal;
        }
}
