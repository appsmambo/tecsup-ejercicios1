import java.util.Random;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        // Escriba un programa que reciba un número n, que será el tamaño de un array
        // que se creará y llenará con números aleatorios. Puede usar la clase Random
        // para generar los números aleatorios. Luego, imprima los elementos del array.
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del array:");
        int el = input.nextInt();
        int [] numeros = new int[el];
        for (int i = 0; i < el; i++) {
            numeros[i] = rnd.nextInt(1000);
            System.out.println("El elemento " + (i + 1) + " es: " + numeros[i]);
        }
        input.close();
    }
}
