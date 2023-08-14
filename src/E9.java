import java.util.Random;
import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        // Escriba un programa que reciba un valor n, que será el tamaño de un
        // array que se inicializará y llenará. Posteriormente, invierta el array
        // (sin usar clases como ArrayList o similares).
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array:");
        int n = input.nextInt();
        int [] arr = new int[n];
        Random rnd = new Random();
        String strArr = "[";
        String strArrInv = "[";
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(100);
            strArr += arr[i] + ", ";
        }
        strArr = strArr.substring(0, strArr.length() - 2) + "]";
        for (int i = n - 1; i >= 0; i--) {
            strArrInv += arr[i] + ", ";
        }
        strArrInv = strArrInv.substring(0, strArrInv.length() - 2) + "]";
        System.out.println("Array generado:");
        System.out.println(strArr);
        System.out.println("Array invertido:");
        System.out.println(strArrInv);
        input.close();
    }
}
