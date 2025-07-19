import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro nome: ");
        var nome1 = scanner.next();
        System.out.printf("Informe a idade de %s: ", nome1);
        var idade1 = scanner.nextInt();

        System.out.print("Informe o segundo nome: ");
        var nome2 = scanner.next();
        System.out.printf("Informe a idade de %s: ", nome2);
        var idade2 = scanner.nextInt();
        var diferencaIdade = Math.abs(idade1 - idade2);
        System.out.printf("A diferença de idade entre %s e %s é de %d anos.%n", nome1, nome2, diferencaIdade);
    }
}
