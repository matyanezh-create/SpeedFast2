public class PedidoEncomienda extends Pedido {

    /**
     * Constructor de la clase PedidoEncomienda.
     * Inicializa los atributos heredados desde la clase abstracta Pedido.
     */
    public PedidoEncomienda(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Calcula el tiempo estimado de entrega para un pedido de encomienda.
     * Tiempo base: 20 minutos.
     * Se agrega 1.5 minutos por cada kilómetro recorrido.
     * El resultado se ajusta a un valor entero.
     */
    @Override
    public int calcularTiempoEntrega() {
        return 20 + (int) Math.round(1.5 * distanciaKm);
    }
}
