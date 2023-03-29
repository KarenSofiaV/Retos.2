
import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int primerLugar,segundoLugar,tercerLugar;
        
        double[] tiempos = new double[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese el tiempo del nadador #" + (i+1) + ": ");
            tiempos[i] = lectura.nextDouble();
        }
        
        primerLugar = 0;
        for (int i = 1; i < 6; i++) {
            if (tiempos[i] < tiempos[primerLugar]) {
                primerLugar = i;
            }
        }
        System.out.println("El ganador es el nadador #" + (primerLugar+1) + " con un tiempo de " + tiempos[primerLugar] + " segundos.");
        
         segundoLugar = 0;
        for (int i = 1; i < 6; i++) {
            if (tiempos[i] > tiempos[primerLugar] && tiempos[i] < tiempos[segundoLugar]) {
                segundoLugar = i;
            }
        }
        System.out.println("El segundo lugar es el nadador #" + (segundoLugar+1) + " con un tiempo de " + tiempos[segundoLugar] + " segundos.");
        
         tercerLugar = 0;
        for (int i = 1; i < 6; i++) {
            if (tiempos[i] > tiempos[segundoLugar] && tiempos[i] < tiempos[tercerLugar]) {
                tercerLugar = i;
            }
        }
        System.out.println("El tercer lugar es el nadador #" + (tercerLugar+1) + " con un tiempo de " + tiempos[tercerLugar] + " segundos.");
    }

}
