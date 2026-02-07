package reto2;

public class HamburguesaBuilder {
    private Hamburguesa hamburguesa;

    public HamburguesaBuilder() {
        hamburguesa = new Hamburguesa();
    }

    public HamburguesaBuilder agregarPan(String tipo, double precio) {
        hamburguesa.agregarIngrediente(new Ingrediente(tipo, precio));
        return this;
    }

    public HamburguesaBuilder agregarCarne(String tipo, double precio) {
        hamburguesa.agregarIngrediente(new Ingrediente(tipo, precio));
        return this;
    }

    public HamburguesaBuilder agregarQueso(String tipo, double precio) {
        hamburguesa.agregarIngrediente(new Ingrediente(tipo, precio));
        return this;
    }

    public HamburguesaBuilder agregarVegetal(String tipo, double precio) {
        hamburguesa.agregarIngrediente(new Ingrediente(tipo, precio));
        return this;
    }

    public HamburguesaBuilder agregarSalsa(String tipo, double precio) {
        hamburguesa.agregarIngrediente(new Ingrediente(tipo, precio));
        return this;
    }

    public Hamburguesa build() {
        return hamburguesa;
    }
}
