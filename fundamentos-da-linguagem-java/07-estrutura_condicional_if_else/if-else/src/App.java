import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        var nome = scanner.next();
        System.out.print("Informe sua idade: ");
        var idade = scanner.nextInt();

        // if (idade >= 18) {
        //     System.out.printf("%s, você tem %s anos e pode dirigir\n", nome, idade);
        // } else {
        //     System.out.printf("%s, você não pode dirigir", nome);
        // }

        var operadorTernario = idade >= 18 ? "Você pode dirigir":"Você não pode dirigir";
        System.out.println(operadorTernario);
    }
}
