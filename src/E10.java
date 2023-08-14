import java.util.Random;
import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        // Escriba un programa en el que el usuario debe adivinar un número
        // aleatorio entre 1 y 100. El programa proporcionará pistas si el
        // número es demasiado alto o demasiado bajo. El juego continuará hasta
        // que el jugador adivine correctamente el número. Al final, imprima el
        // número y la cantidad de intentos realizados.
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        final int maximo = 100;
        int numeroRandom = rnd.nextInt(maximo);
        int numero, intentos = 0;
        boolean terminar = false;
        System.out.println("**************************************************");
        System.out.println("Se ha generado un número aleatorio del 1 al " + maximo);
        System.out.println("Debes adivinar este número para ganar");
        System.out.println("Ingresa el número para jugar...");
        do {
            int diferencia = 0;
            intentos++;
            numero = input.nextInt();
            diferencia = numeroRandom - numero;
            if (diferencia == 0) {
                // adivinaste
                System.out.println("El número ganador es: " + numero);
                System.out.println("¡Enhorabuena adivinaste!");
                System.out.println("Intentos: " + intentos);
                terminar = true;
            } else if (diferencia > 0) {
                // muy alto
                if (diferencia > 10)
                    System.out.println("El número ingresado es demasiado bajo.");
                else
                    System.out.println("¡Estás cerca!");
            } else {
                // muy bajo
                if (diferencia < -10)
                    System.out.println("El número ingresado es demasiado alto.");
                else
                    System.out.println("¡Estás cerca!");
            }
        } while (!terminar);
        input.close();
    }
}
