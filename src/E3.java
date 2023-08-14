import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        // Implemente una aplicación que permita
        // calcular el pago que debe realizar una familia por el consumo de agua potable.
        // Se sabe que existe un pago fijo de $10.00 y que los primeros 50 litros de agua no tienen costo.
        // Entre 51 y 200 litros se cobra $0.5 por litro,
        // y más de 200 litros a $1.5 por litro.
        Scanner input = new Scanner(System.in);
        final float costo = 0.5f;
        final float costoExtra = 1.5f;
        final float base = 10;
        float consumo, pago = base;
        System.out.println("Ingrese su consumo de agua potable en litros:");
        consumo = input.nextInt();
        if (consumo > 50 && consumo <= 200) {
            pago += (consumo - 50) * costo;
        }
        if (consumo > 200) {
            pago += (consumo - 200) * costoExtra;
        }
        System.out.println("El pago es: " + pago);
        input.close();
    }
}
