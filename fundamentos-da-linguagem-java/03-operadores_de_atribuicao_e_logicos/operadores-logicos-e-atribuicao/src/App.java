import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Quantos anos você tem? ");
        var idade = scanner.nextInt();
        var maiorDeIdade = idade >= 18;
        System.out.printf("Você pode dirigir? (%s)", maiorDeIdade);
        // ---------------------------------------------------------------------
        // System.out.println("Quanto é 2 + 2? ");
        // var resultado = scanner.nextInt();
        // var estaCorreto = resultado == 4;
        // System.out.printf("O resultado é 4, você acertou? (%s)", estaCorreto);
    }
}
