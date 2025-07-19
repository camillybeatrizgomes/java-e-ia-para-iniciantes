package questao_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir mensagem
        System.out.print("Digite a mensagem de marketing: ");
        String mensagem = scanner.nextLine();

        // 2. Mostrar opções de serviços
        System.out.println("\nEscolha os serviços para enviar a mensagem (digite os números separados por vírgula):");
        System.out.println("1 - SMS");
        System.out.println("2 - E-mail");
        System.out.println("3 - Redes Sociais");
        System.out.println("4 - WhatsApp");
        System.out.print("Sua escolha: ");
        String[] opcoes = scanner.nextLine().split(",");

        // 3. Criar a lista de serviços escolhidos
        List<ServicoMensagem> servicosSelecionados = new ArrayList<>();

        for (String opcao : opcoes) {
            switch (opcao.trim()) {
                case "1":
                    servicosSelecionados.add(msg -> System.out.println(" Enviando SMS: " + msg));
                    break;
                case "2":
                    servicosSelecionados.add(msg -> System.out.println(" Enviando E-mail: " + msg));
                    break;
                case "3":
                    servicosSelecionados.add(msg -> System.out.println(" Postando nas Redes Sociais: " + msg));
                    break;
                case "4":
                    servicosSelecionados.add(msg -> System.out.println(" Enviando no WhatsApp: " + msg));
                    break;
                default:
                    System.out.println("Opção inválida: " + opcao.trim());
            }
        }

        // 4. Enviar a mensagem para os serviços escolhidos
        System.out.println("\n Enviando mensagens...");
        for (ServicoMensagem servico : servicosSelecionados) {
            servico.enviar(mensagem);
        }

        scanner.close();
    }
}
