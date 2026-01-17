public class Main {

    public static void main(String[] args) {

        // Creación de un pedido de tipo comida
        Pedido pedido1 = new PedidoComida(
                "FF7-001",
                "Sector 7 Slums, Midgar",
                4
        );

        // Creación de un pedido de tipo encomienda
        Pedido pedido2 = new PedidoEncomienda(
                "FF7-002",
                "Shinra Headquarters, Midgar",
                6
        );

        // Creación de un pedido de tipo express
        Pedido pedido3 = new PedidoExpress(
                "FF7-003",
                "Gold Saucer, Corel",
                7
        );

        // Mostrar la información y el tiempo estimado de cada pedido
        mostrarPedido(pedido1);
        mostrarPedido(pedido2);
        mostrarPedido(pedido3);
    }

    /**
     * Método que recibe un pedido y muestra su resumen
     * junto con el tiempo estimado de entrega.
     * Se utiliza polimorfismo, ya que puede recibir
     * cualquier tipo de Pedido.
     */
    private static void mostrarPedido(Pedido pedido) {
        pedido.mostrarResumen();
        System.out.println(
                "Tiempo estimado de entrega: "
                        + pedido.calcularTiempoEntrega()
                        + " minutos"
        );
        System.out.println();
    }
}
