import java.util.Scanner;

public class Calculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numUno = 0, numDos = 0;

        System.out.println("Digite el primer numero: ");
        numUno = scanner.nextInt();

        System.out.println("Digite el segundo numero: ");
        numDos = scanner.nextInt();

        System.out.println("El resultado de la suma es: " + sumar(numUno, numDos));
        System.out.println("El resultado de la resta es: " + restar(numUno, numDos));
        System.out.println("El resultado de la multiplicacion es: " + multiplicar(numUno, numDos));
        System.out.println("El resultado de la division es: " + dividir(numUno, numDos));
    }
}