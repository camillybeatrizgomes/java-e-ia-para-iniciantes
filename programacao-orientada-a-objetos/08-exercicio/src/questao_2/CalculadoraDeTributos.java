package questao_2;

import java.util.Scanner;

public class CalculadoraDeTributos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perguntar o valor do produto
        System.out.print("Digite o valor do produto: R$ ");
        double valorProduto = scanner.nextDouble();
        scanner.nextLine(); // limpar o buffer

        // Mostrar opções de tipo de produto
        System.out.println("\nEscolha o tipo do produto:");
        System.out.println("1 - Alimentação");
        System.out.println("2 - Saúde e Bem-estar");
        System.out.println("3 - Vestuário");
        System.out.println("4 - Cultura");
        System.out.print("Digite o número correspondente: ");
        int opcao = scanner.nextInt();

        // Interface funcional com lambdas para cada tipo
        CalculadorTributo calculador;

        switch (opcao) {
            case 1:
                calculador = valor -> valor * 0.01;
                break;
            case 2:
                calculador = valor -> valor * 0.015;
                break;
            case 3:
                calculador = valor -> valor * 0.025;
                break;
            case 4:
                calculador = valor -> valor * 0.04;
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        // Calcular e mostrar o tributo
        double tributo = calculador.calcular(valorProduto);
        System.out.printf("\nValor do tributo: R$ %.2f\n", tributo);

        scanner.close();
    }
}
