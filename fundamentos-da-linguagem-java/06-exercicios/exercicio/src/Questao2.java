import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho do lado do quadrado: ");
        var lado = scanner.nextDouble();
        var area = lado * lado;
        System.out.printf("A área do quadrado é de %s", area);
    }
}
