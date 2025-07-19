package questao_2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();

        int opcao;

        do {
            System.out.println("\n===== MENU DO CARRO =====");
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para esquerda");
            System.out.println("6 - Virar para direita");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Trocar marcha");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.diminuirVelocidade();
                    break;
                case 5:
                    carro.virar("esquerda");
                    break;
                case 6:
                    carro.virar("direita");
                    break;
                case 7:
                    carro.verificarVelocidade();
                    break;
                case 8:
                    System.out.print("Digite a marcha desejada (0 a 6): ");
                    int novaMarcha = sc.nextInt();
                    carro.trocarMarcha(novaMarcha);
                    break;
                case 0:
                    System.out.println("Desligando painel do carro...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();

    }
}
