import java.util.Random;
import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        // Escriba un programa que reciba un valor n, que será el tamaño de un
        // array que se inicializará y llenará. Luego, encuentre cuál es el valor más grande.
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ingrese el tamaño del array:");
        int nroMayor = 0, n = input.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(1000);
            if (arr[i] > nroMayor) nroMayor = arr[i];
            System.out.println("El valor de " + (i + 1) + " es: " + arr[i]);
        }
        System.out.println("El valor más grande del array es: " + nroMayor);
        input.close();
    }
}
