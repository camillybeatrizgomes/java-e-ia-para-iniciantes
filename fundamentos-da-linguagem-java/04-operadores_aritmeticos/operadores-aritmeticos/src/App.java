import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        var valor1 = scanner.nextInt();
        System.out.print("Informe o segundo valor: ");
        var valor2 = scanner.nextInt();

        System.out.printf("%s + %s = %s", valor1, valor2, (valor1 + valor2));
        System.out.printf("\n%s - %s = %s", valor1, valor2, (valor1 - valor2));
        System.out.printf("\n%s x %s = %s", valor1, valor2, (valor1 * valor2));
        System.out.printf("\n%s / %s = %s", valor1, valor2, (valor1 / valor2));
        System.out.println(50 + valor1++);
        System.out.println(50 + ++valor1);
        System.out.println(valor1);

    }
}
