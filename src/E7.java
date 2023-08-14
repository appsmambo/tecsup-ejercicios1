import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        // La operación factorial se define de la siguiente manera:
        // Cree una clase Factorial que tenga un método llamado resolverFactorial
        // que reciba un valor n, donde n es el valor del factorial a calcular.
        // Donde 5 es el valor a calcular: 5! = 5 * 4 * 3 * 2 * 1 = 120
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número para calcular su factorial:");
        int factorial = 0, n = input.nextInt();
        if (n <= 2) {
            System.out.println("El factorial de " + n + " es: " + n);
            return;
        }
        for (int i = 2; i < n ; i++) {
            factorial += i * (i + 1);
        }
        System.out.println("!" + n + " es: " + factorial);
        input.close();
    }
}
