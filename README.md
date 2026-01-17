SpeedFast 2 – Sistema de Pedidos en Java
Descripción

Aplicación desarrollada en Java como parte de la asignatura Desarrollo Orientado a Objetos II, cuyo propósito es modelar un sistema de pedidos utilizando una clase abstracta y una jerarquía de clases. El proyecto pone en práctica los principios de abstracción, herencia, polimorfismo y sobrescritura de métodos.

Organización del código
src/
├── Pedido.java
├── PedidoComida.java
├── PedidoEncomienda.java
├── PedidoExpress.java
└── Main.java

Descripción del funcionamiento

Pedido actúa como clase base abstracta, concentrando los atributos y métodos comunes a todos los pedidos.

Cada tipo de pedido (PedidoComida, PedidoEncomienda, PedidoExpress) extiende esta clase y define su propia forma de calcular el tiempo de entrega.

El método calcularTiempoEntrega() es sobrescrito en cada subclase según las reglas del negocio.

En Main se crean instancias de distintos tipos de pedidos utilizando referencias del tipo Pedido, evidenciando el uso de polimorfismo.

El programa imprime por consola un resumen del pedido y el tiempo estimado correspondiente.

Ejecución del proyecto

Abrir el proyecto en IntelliJ IDEA.

Verificar que el SDK de Java esté correctamente configurado.

Ejecutar la clase Main.

Visualizar los resultados en la consola.
