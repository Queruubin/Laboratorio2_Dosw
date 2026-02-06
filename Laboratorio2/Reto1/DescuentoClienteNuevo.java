
public class DescuentoClienteNuevo implements DescuentoStrategy {
    private static final double DESCUENTO = 0.05;

    @Override
    public double aplicarDescuento(double subtotal) {
        return subtotal * DESCUENTO;
    }


public class DescuentoClienteFrecuente implements DescuentoStrategy {

    private static final double DESCUENTO = 0.10;

    @Override
    public double aplicarDescuento(double subtotal) {
        return subtotal * DESCUENTO;
    }
}
}