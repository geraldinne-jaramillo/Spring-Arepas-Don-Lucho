🫓 **ArepasDonLucho: Sistema de Gestión de Pedidos y Entrega** 🛵
✨ **Descripción del Proyecto:**
Este es un proyecto Spring Boot que simula un sistema de gestión para un negocio de arepas llamado "Arepas Don Lucho". 
Se enfoca en la gestión de pedidos, los detalles de entrega, y la información de clientes y repartidores.
El proyecto utiliza Spring Data JPA para la persistencia de datos y se conecta a una base de datos MySQL.

🗺️ **Modelo de Entidades**
El proyecto define las siguientes entidades principales, reflejando la estructura del negocio:

**Pedido 🧾:** Representa una orden de arepas.
**Relación:** ManyToOne con Repartidor, OneToOne con DetalleEntrega.

**DetalleEntrega 📦:** Registra los tiempos y el estado de la entrega del pedido (hora de salida de cocina, hora de entrega, estado).
**Relación:** OneToOne con Pedido.

**Repartidor 🏍️:** Información del personal encargado de las entregas (nombre, vehículo, zona de cobertura).
**Relación:** OneToMany con Pedido.

**Cliente 🧑:** Información del cliente.
**Relación:** OneToOne con DireccionEntrega.

**DireccionEntrega 📍:** Detalles de la ubicación de entrega (ciudad, barrio, dirección de texto).
**Relación:** OneToOne con Cliente.

