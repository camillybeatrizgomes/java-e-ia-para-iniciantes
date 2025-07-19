import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe a base de um retângulo: ");
        var base = scanner.nextDouble();
        System.out.print("Informe a altura de um retângulo: ");
        var altura = scanner.nextDouble();
        var area = base * altura;
        System.out.printf("A área do retângulo é de %s", area);
    }
}
