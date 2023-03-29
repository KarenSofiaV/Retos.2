import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        String[] productos = {"Chicles de menta", "Chicles de fresa", "Chocolatinas", "Galletas", "Papitas fritas", "Caramelos", "Chicles de canela", "Chicles de frutas", "Chocolates", "Chicles de hierbabuena", "Chicles de tutti-frutti", "Gomitas", "Chicles de uva", "Palomitas", "Chicles de piña", "Chicles de cereza"};
        int[] precios = {100, 100, 500, 1000, 1500, 200, 100, 100, 700, 100, 100, 300, 100, 1200, 100, 100};
        int[] codigos = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116};
        int total, cantidad;
        System.out.println("Matriz de productos:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + "\t" + precios[i] + "\t" + codigos[i]);
        }
        System.out.println("Bienvenido a la dispensadora de dulces.");
        Scanner lectura = new Scanner(System.in);
        boolean seguirComprando = true;
        while (seguirComprando) {
            System.out.println("Por favor ingrese el código del producto que desea comprar o 0 para salir:");
            int codigo = lectura.nextInt();
            if (codigo == 0) {
                seguirComprando = false;
            } else {
                int indice = -1;
                for (int i = 0; i < codigos.length; i++) {
                    if (codigos[i] == codigo) {
                        indice = i;
                        break;
                    }
                }
                if (indice == -1) {
                    System.out.println("El código ingresado no es válido.");
                } else {
                    System.out.println("Usted ha seleccionado: " + productos[indice]);
                    System.out.println("El precio es: " + precios[indice]);
                    System.out.println("Ingrese la cantidad de unidades que desea comprar:");
                     cantidad = lectura.nextInt();
                     total = cantidad * precios[indice];
                    System.out.println("El precio total es: " + total);
                    System.out.println("Gracias por su compra.");
                }
            }
        }
        System.out.println("Adiós.");
    }
}

