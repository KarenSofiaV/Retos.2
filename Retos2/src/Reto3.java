import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        // Crear una matriz 4x4 con letras aleatorias
        char[][] matriz = new char[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (char) ('H' + Math.random() * 13);
            }
        }

        // Imprimir la matriz en la consola
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Pedir al usuario que ingrese 8 palabras
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[8];
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese la palabra #" + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
        }

        // Verificar cuántas palabras están repetidas en la matriz
        int palabrasRepetidas = 0;
        for (String palabra : palabras) {
            boolean encontrada = false;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == palabra.charAt(0)) {
                        // Verificar si la palabra está en la fila hacia la derecha
                        encontrada = true;
                        for (int k = 1; k < palabra.length(); k++) {
                            if (j + k >= matriz[i].length || matriz[i][j+k] != palabra.charAt(k)) {
                                encontrada = false;
                                break;
                            }
                        }
                        if (encontrada) {
                            palabrasRepetidas++;
                            break;
                        }

                        // Verificar si la palabra está en la columna hacia abajo
                        encontrada = true;
                        for (int k = 1; k < palabra.length(); k++) {
                            if (i + k >= matriz.length || matriz[i+k][j] != palabra.charAt(k)) {
                                encontrada = false;
                                break;
                            }
                        }
                        if (encontrada) {
                            palabrasRepetidas++;
                            break;
                        }
                    }
                }
                if (encontrada) {
                    break;
                }
            }
        }

        // Imprimir el resultado
        System.out.println("Se encontraron " + palabrasRepetidas + " palabras repetidas en la matriz.");
    }
}

