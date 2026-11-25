import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer numero (-99999 a 99999): ");
        if (!sc.hasNextInt()) {
            System.out.println("Tiene que ser un numero entero");
            sc.close();
            return;
        }
        int a = sc.nextInt();

        System.out.print("Segundo numero (-99999 a 99999): ");
        if (!sc.hasNextInt()) {
            System.out.println("Tiene que ser un numero entero");
            sc.close();
            return;
        }
        int b = sc.nextInt();

        if (a < -99999 || a > 99999 || b < -99999 || b > 99999) {
            System.out.println("Error: los numeros tienen que estar entre -99999 y 99999");
            sc.close();
            return;
        }

        System.out.print("Operacion (suma, resta, multiplicacion, potencia): ");
        String op = sc.next().toLowerCase();

        // Usamos long por si el resultado se pasa de un int normal
        if (op.equals("suma")) {
            System.out.println("Resultado: " + ((long) a + b));
        } else if (op.equals("resta")) {
            System.out.println("Resultado: " + ((long) a - b));
        } else if (op.equals("multiplicacion")) {
            System.out.println("Resultado: " + ((long) a * b));
        } else if (op.equals("potencia")) {
            if (b < 0) {
                System.out.println("Error: el exponente no puede ser negativo");
                sc.close();
                return;
            }
            long res = 1;
            for (int i = 0; i < b; i++) {
                res = res * a;
            }
            System.out.println("Resultado: " + res);
        } else {
            System.out.println("Operacion no valida");
        }

        sc.close();
    }
}