public class PedidoComida extends Pedido {

    /**
     * Constructor de la clase PedidoComida.
     * Inicializa los atributos heredados desde la clase abstracta Pedido.
     */
    public PedidoComida(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Calcula el tiempo estimado de entrega para un pedido de comida.
     * Tiempo base: 15 minutos.
     * Se agregan 2 minutos por cada kilómetro recorrido.
     */
    @Override
    public int calcularTiempoEntrega() {
        return 15 + (int) (2 * distanciaKm);
    }
}
