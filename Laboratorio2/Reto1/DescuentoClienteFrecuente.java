public class DescuentoClienteFrecuente implements DescuentoStrategy {

    private static final double DESCUENTO = 0.10;

    @Override
    public double aplicarDescuento(double subtotal) {
        return subtotal * DESCUENTO;
    }
}
