package questao_1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bem-vindo ao Banco ===");
        System.out.print("Digite o valor do depósito inicial: R$ ");
        double depositoInicial = sc.nextDouble();
        ContaBancaria conta = new ContaBancaria(depositoInicial);

        int opcao;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se está usando cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.consultarChequeEspecial();
                    break;
                case 3:
                    System.out.print("Digite o valor para depositar: R$ ");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.print("Digite o valor para sacar: R$ ");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 5:
                    System.out.print("Digite o valor do boleto: R$ ");
                    double valorBoleto = sc.nextDouble();
                    conta.pagarBoleto(valorBoleto);
                    break;
                case 6:
                    if (conta.estaUsandoChequeEspecial()) {
                        System.out.println("Você está usando o cheque especial.");
                    } else {
                        System.out.println("Você NÃO está usando o cheque especial.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Obrigado por usar o banco!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}