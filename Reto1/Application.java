public class Application {

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        Producto camiseta = new Producto("Camiseta", 20000);
        Producto pantalon = new Producto("Pantalón", 50000);
        Producto galletas = new Producto("Galletas", 500);
        Producto jugo = new Producto("Jugo Natural", 3000);

        Cliente cliente = new Cliente(
                "Frecuente",
                new DescuentoClienteFrecuente()
        );

        Carrito carrito = new Carrito();

        carrito.agregarProducto(camiseta, 2);
        carrito.agregarProducto(galletas, 3);
        carrito.agregarProducto(jugo, 5);

        Recibo.imprimir(cliente, carrito);
    }
}
