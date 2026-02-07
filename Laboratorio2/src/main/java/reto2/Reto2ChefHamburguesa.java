package reto2;

import java.util.Scanner;

public class Reto2ChefHamburguesa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HamburguesaBuilder builder = new HamburguesaBuilder();

        System.out.println("Bienvenido al Chef de 5 Estrellas. Personaliza tu hamburguesa.");

        System.out.print("Agregar pan (tipo,precio): ");
        String[] pan = sc.nextLine().split(",");
        builder.agregarPan(pan[0], Double.parseDouble(pan[1]));

        System.out.print("Agregar carne (tipo,precio): ");
        String[] carne = sc.nextLine().split(",");
        builder.agregarCarne(carne[0], Double.parseDouble(carne[1]));

        System.out.print("Agregar queso (tipo,precio): ");
        String[] queso = sc.nextLine().split(",");
        builder.agregarQueso(queso[0], Double.parseDouble(queso[1]));

        System.out.print("Agregar vegetal (tipo,precio): ");
        String[] vegetal = sc.nextLine().split(",");
        builder.agregarVegetal(vegetal[0], Double.parseDouble(vegetal[1]));

        System.out.print("Agregar salsa (tipo,precio): ");
        String[] salsa = sc.nextLine().split(",");
        builder.agregarSalsa(salsa[0], Double.parseDouble(salsa[1]));

        Hamburguesa hamburguesa = builder.build();
        System.out.println("\n¡Tu hamburguesa está lista!");
        System.out.println(hamburguesa);
    }
}
