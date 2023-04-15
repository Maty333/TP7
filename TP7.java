package herencia;

import java.util.Scanner;

public class TP7 {

    public static void main(String[] args) {
        Scanner compras = new Scanner(System.in);

        String[] NombreProds = new String[3];
        int[] CantProd = new int[3];
        double[] ProdPrecio = new double[3];

        for (int i = 0; i < NombreProds.length; i++) {
            System.out.println("Por favor, ingrese un producto a su carrito");
            System.out.println("Maximo 3 productos por descuento");
            System.out.println(".............................................");
            System.out.println("Ingrese el nombre del producto: ");
            NombreProds[i] = compras.next();

            System.out.println("Ingrese la cantidad a llevar del producto");
            CantProd[i] = compras.nextInt();

            System.out.println("Ingrese el precio del producto");
            ProdPrecio[i] = compras.nextDouble();
        }

        System.out.println("Cantidad\tPrecio\tNombre del Producto");

        for (int i = 0; i < NombreProds.length; i++) {
            System.out.printf("%d\t\t%.2f\t%s\n", CantProd[i], ProdPrecio[i], NombreProds[i]);
        }
    }
}

