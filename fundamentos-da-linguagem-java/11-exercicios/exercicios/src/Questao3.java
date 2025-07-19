import java.util.Scanner;

public class Questao3 {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        var primeiroNumero = scanner.nextInt();
        System.out.print("Informe o segundo número: ");
        var segundoNumero = scanner.nextInt();

        while (segundoNumero <= primeiroNumero) {
            System.out.print("O segundo número deve ser maior que o primeiro. Informe novamente: ");
            segundoNumero = scanner.nextInt();
        }
        System.out.print("Escolha a opção (1) para pares ou (2) para ímpares: ");
        var opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                for (var i = segundoNumero; i >= primeiroNumero; i--) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;

            case 2:
                for (var i = segundoNumero; i >= primeiroNumero; i--) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;
        
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
