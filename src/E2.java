import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continuar = 's';
        System.out.println("==================");
        System.out.println("Sistema de ingreso");
        System.out.println("==================");
        do {
            String nombre = "";
            byte edad;
            char regalo = 's';
            System.out.println("Ingrese el nombre del invitado:");
            nombre = input.next();
            System.out.println("Ingrese la edad del invitado:");
            edad = input.nextByte();
            if (edad >= 15) {
                System.out.println(nombre + " trae regalo? Pulse: S para Sí, N para No...");
                regalo = input.next().charAt(0);
                if (regalo == 's' || regalo == 'S') {
                    System.out.println("El invitado: " + nombre + " SÍ puede ingresar a la fiesta.");
                } else {
                    System.out.println("El invitado: " + nombre + " NO puede ingresar a la fiesta.");
                }
            } else
                System.out.println("El invitado: " + nombre + " SÍ puede ingresar a la fiesta.");
            System.out.println("Desea continuar? Pulse: S para Continuar, N para Salir...");
            continuar = input.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');
        input.close();
    }
}
