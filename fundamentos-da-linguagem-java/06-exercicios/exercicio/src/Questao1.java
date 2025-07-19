import java.time.LocalDate;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var anoAtual = LocalDate.now().getYear();
        System.out.print("Informe seu nome: ");
        var nome = scanner.next();
        System.out.print("Informe o ano de nascimento: ");
        var anoNascimento = scanner.nextInt();
        var idade  = anoAtual - anoNascimento;
        System.out.printf("Olá %s você tem %s anos.", nome, idade);
    }
}
