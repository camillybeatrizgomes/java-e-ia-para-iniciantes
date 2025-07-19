import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        var numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero +" x "+ i +" = "+ numero * i);
        }
    }
}