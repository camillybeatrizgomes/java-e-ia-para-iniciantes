import java.util.Scanner;

public class Questao4 {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        var numero = scanner.nextInt();

        while (true) {
            System.out.print("Informe o número para verificação: ");
            var verificacao = scanner.nextInt();

            if (verificacao < numero) {
                System.out.println("Informe um número maior que "+ numero);
                continue;
            }

            var resultado = verificacao % numero;
            System.out.printf("%s %% %s = %s \n", verificacao, numero, resultado);
            if (resultado != 0) break;
        }
    }
}
