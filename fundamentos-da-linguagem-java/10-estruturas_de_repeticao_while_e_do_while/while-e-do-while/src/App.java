import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var nome = "";

        // Estrutura WHILE

        while (true) {
            System.out.print("Informe um nome: ");
            nome = scanner.next();
            System.out.print(nome);

            if (nome.equalsIgnoreCase("sair")) break;
        }

        // Estrutura DO WHILE

        // do {
        //     System.out.print("Informe um nome: ");
        //     nome = scanner.next();
        //     System.out.println(nome);

        //     if (nome.equalsIgnoreCase("sair")) break;
        // } while (true);

        // A diferença entre WHILE e DO WHILE é que o DO WHILE executa pelo menos uma vez o bloco de código, mesmo que a condição seja falsa.
    }
}
