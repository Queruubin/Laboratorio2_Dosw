public class Recibo {

    public static void imprimir(Cliente cliente, Carrito carrito) {

        double subtotal = carrito.calcularSubtotal();
        double descuento = cliente.calcularDescuento(subtotal);
        double total = subtotal - descuento;

        System.out.println("\n--- RECIBO DE COMPRA ---");
        System.out.println("Cliente: " + cliente.getTipo());
        System.out.println("Productos:");

        carrito.getItems().forEach(item -> {
            System.out.println("- "
                    + item.getProducto().getNombre()
                    + " - $" + item.getTotal());
        });

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + total);
        System.out.println("------------------------");
        System.out.println("¡Gracias por su compra!");
    }
}
