import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float precioHora = 40;
        float precioExtra = 0, horasExtra = 0, horasExtraPlus = 0;
        float sueldo = 0;
        System.out.println("Ingrese las horas trabajadas:");
        float horasTrabajadas = input.nextFloat();
        if (horasTrabajadas > 40) {
            horasExtra = horasTrabajadas - 40;
            horasExtraPlus = 0;
            horasTrabajadas = 40;
            if (horasExtra > 8) {
                horasExtraPlus = horasExtra - 8;
                horasExtra = 8;
            }
            sueldo = precioHora * horasTrabajadas;
            precioExtra += horasExtra * (precioHora * 2);
            precioExtra += horasExtraPlus * (precioHora * 3);
            sueldo += precioExtra;
        } else {
            sueldo = precioHora * horasTrabajadas;
        }
        System.out.println("Horas base: " + horasTrabajadas);
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Horas extra plus: " + horasExtraPlus);
        System.out.println("El sueldo del trabajador es: " + sueldo);
        input.close();
    }
}
