import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Exemplo de uma estrutura de repetição for, onde o programa roda de forma infinita

        // for (;;){
        //     System.out.print("Digite um nome: ");
        //     var nome = scanner.next();

        //     if (nome.equalsIgnoreCase("sair")) break;

        //     System.out.println(nome);
        // }

        for (var i = 2; i <= 100; i++) {
            if (i % 2 == 0) 
                System.out.println(i);
        }
        
    }
}
