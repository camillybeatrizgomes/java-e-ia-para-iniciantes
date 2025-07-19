package questao_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Campo> campos = new ArrayList<>();

        System.out.print("Digite o separador que deseja usar (ex: ; ou |): ");
        String separador = scanner.nextLine();

        System.out.println("\nDigite os campos no formato: NOME" + separador + "VALOR" + separador + "TIPO");
        System.out.println("Digite 'sair' para encerrar a entrada.\n");

        while (true) {
            System.out.print("Entrada: ");
            String linha = scanner.nextLine();
            if (linha.equalsIgnoreCase("sair")) break;

            String[] partes = linha.split(Pattern.quote(separador));
            if (partes.length != 3) {
                System.out.println("Entrada inválida. Deve conter exatamente 3 partes.");
                continue;
            }

            String nome = partes[0];
            String valor = partes[1];
            TipoCampo tipo = TipoCampo.fromString(partes[2]);

            if (tipo == TipoCampo.INVALIDO) {
                System.out.println("Tipo inválido.");
                continue;
            }

            campos.add(new Campo(nome, valor, tipo));
        }

        // Mostrar resultados
        Formatador formatador = new FormatadorPadrao();

        System.out.println("\nJSON:");
        System.out.println(formatador.gerarJson(campos));

        System.out.println("\nYAML:");
        System.out.println(formatador.gerarYaml(campos));

        System.out.println("\nXML:");
        System.out.println(formatador.gerarXml(campos));

        scanner.close();
    }
}
