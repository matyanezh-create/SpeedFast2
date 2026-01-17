public class PedidoExpress extends Pedido {

    /**
     * Constructor de la clase PedidoExpress.
     * Inicializa los atributos heredados desde la clase abstracta Pedido.
     */
    public PedidoExpress(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Calcula el tiempo estimado de entrega para un pedido express.
     * Tiempo base: 10 minutos.
     * Si la distancia es mayor a 5 km, se agregan 5 minutos adicionales.
     */
    @Override
    public int calcularTiempoEntrega() {
        int tiempo = 10;

        // Se valida si la distancia supera los 5 km
        if (distanciaKm > 5) {
            tiempo += 5;
        }

        return tiempo;
    }
}
