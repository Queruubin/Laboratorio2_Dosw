package reto2;

import java.util.ArrayList;
import java.util.List;

public class Hamburguesa {
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public double getPrecioTotal() {
        return ingredientes.stream()
                .mapToDouble(Ingrediente::getPrecio)
                .sum();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hamburguesa con:\n");
        for (Ingrediente i : ingredientes) {
            sb.append(" - ").append(i).append("\n");
        }
        sb.append("Precio total: $").append(getPrecioTotal());
        return sb.toString();
    }
}
