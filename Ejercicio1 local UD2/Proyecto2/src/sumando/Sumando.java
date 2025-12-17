package sumando;
import java.util.Scanner;

public class Sumando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;
        System.out.println("La suma de los dos números es: " + suma);

        sc.close();
    }
}
