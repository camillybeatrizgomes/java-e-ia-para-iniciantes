package questao_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de telefone (com ou sem formatação):");
        String entrada = scanner.nextLine();

        // Limpa todos os caracteres não numéricos
        String numeros = entrada.replaceAll("\\D", "");

        Telefone telefone = null;
        TipoTelefone tipo = TipoTelefone.INVALIDO;

        // Identifica o tipo com base na quantidade de dígitos
        if (numeros.length() == 8 || numeros.length() == 10) {
            telefone = new TelefoneFixo(numeros);
            tipo = TipoTelefone.FIXO;
        } else if (numeros.length() == 9 || numeros.length() == 11) {
            telefone = new TelefoneCelular(numeros);
            tipo = TipoTelefone.CELULAR;
        }

        // Resposta ao usuário
        System.out.println("\nResultado da análise:");

        if (telefone != null) {
            System.out.println("Número válido!");
            System.out.println("Tipo de telefone: " + tipo);
            System.out.println("Número formatado corretamente: " + telefone.formatar());
        } else {
            System.out.println("Número inválido. A quantidade de dígitos não corresponde a um telefone fixo ou celular.");
        }
        scanner.close();
    }
}