import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        // Escriba un programa que reciba un número n e imprima los números impares menores a n.
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número para la operación:");
        int n = input.nextInt();
        String msg = "";
        for (int i = 0; i < n; i++) {
            msg += (i % 2 != 0) ? i + ", " : "";
            /*
            if (i % 2 != 0) {
                msg += i + ", ";
            }
            */
        }
        System.out.println("Los números impares menores a " + n + " son:");
        System.out.println(msg.substring(0, msg.length() - 2));
        input.close();
    }
}
