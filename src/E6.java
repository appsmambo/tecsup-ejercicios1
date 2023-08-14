import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        // Dado un valor n, genere la siguiente secuencia:
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número para la secuencia:");
        int n = input.nextInt();
        String msg = "";
        for (int i = 1; i <= n; i++) {
            msg = "";
            for (int j = 1; j <= i; j++) {
                msg += "* ";
            }
            System.out.println(msg);
        }
        input.close();
    }
}
