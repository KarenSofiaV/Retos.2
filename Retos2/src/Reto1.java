import java.util.Scanner;

public class Reto1 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int n, cantidadMultiplos;
        
        System.out.print("Ingrese la cantidad de números que desea registrar: ");
         n = lectura.nextInt();
        
        int[] numeros = new int[n];

         cantidadMultiplos = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = lectura.nextInt();
            if (numeros[i] % 2 == 0) {
                cantidadMultiplos++;
            }
        }
        
        System.out.println("La cantidad de números registrados que son múltiplos de 2 es: " + cantidadMultiplos);
    }

}