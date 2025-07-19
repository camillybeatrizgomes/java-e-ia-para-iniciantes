package questao_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe a operação que deseja realizar (1 - Soma e 2 - Subtração): ");
        var opcaoDaOperacao = scanner.nextInt();

        while (opcaoDaOperacao > 2 || opcaoDaOperacao < 1) {
            System.out.println("Escolha uma opção válida (1 - soma, 2 - subtração)");
            opcaoDaOperacao = scanner.nextInt();
        }
        var selecionarOperacao = Operacao.values()[opcaoDaOperacao - 1];
        System.out.println("Informe os números que serão usados separados por vígula (ex.: 1,2,3,4)");
        var numeros = scanner.next();
        var valoresArray = Arrays.stream(numeros.split(",")).mapToLong(Long::parseLong).toArray();

        var resultado = selecionarOperacao.getChamadaDaOperacao().exec(valoresArray);
        var mostrarOperacao = numeros.replaceAll(",", " " + selecionarOperacao.getSinal() + " ");
        System.out.printf("O resultado da operação %s = %s \n", mostrarOperacao, resultado);
    }
}