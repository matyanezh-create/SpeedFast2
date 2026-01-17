public abstract class Pedido {

    // Identificador único del pedido
    protected String idPedido;

    // Dirección donde se realizará la entrega
    protected String direccionEntrega;

    // Distancia estimada hasta el lugar de entrega (en kilómetros)
    protected double distanciaKm;

    /**
     * Constructor de la clase abstracta Pedido.
     * Inicializa los atributos comunes a todos los tipos de pedidos.
     */
    public Pedido(String idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    /**
     * Muestra un resumen básico del pedido.
     * Este método es común para todos los tipos de pedidos.
     */
    public void mostrarResumen() {
        System.out.println(getClass().getSimpleName() + " #" + idPedido);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " km");
    }

    /**
     * Método abstracto que calcula el tiempo estimado de entrega.
     * Cada subclase debe implementar su propia lógica.
     */
    public abstract int calcularTiempoEntrega();
}
