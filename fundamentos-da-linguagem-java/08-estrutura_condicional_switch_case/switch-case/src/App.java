import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7: ");
        var opcao = scanner.nextInt();

        // switch (opcao) {
        //     case 1:
        //     case 7:
        //         System.out.println("Fim de Semana");
        //         break;
        //     case 2:
        //         System.out.println("Segunda");
        //         break;
        //     case 3:
        //         System.out.println("Terça");
        //         break;
        //     case 4:
        //         System.out.println("Quarta");
        //         break;
        //     case 5:
        //         System.out.println("Quinta");
        //         break;
        //     case 6:
        //         System.out.println("Sexta");
        //         break;
        //     default:
        //         System.out.println("Opção inválida");
        //         break;
        // }

        // Outra forma de Switch case
        switch (opcao) {
            case 1, 7 -> System.out.println("Fim de Semana");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            default -> System.out.println("Opção inválida");
        }
        // Estrutura válida para um comando de apenas uma linha, sem a necessidade de chaves, sendo uma outra forma de escrever o switch case.~
        /* SINTAXE:
         * switch (variavel) {
         *     case valor1, valor2 -> {
         *        // Comandos a serem executados
         *     }
         * }
         */
    }
}
