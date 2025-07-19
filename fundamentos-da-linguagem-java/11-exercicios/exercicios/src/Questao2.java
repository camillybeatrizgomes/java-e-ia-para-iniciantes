import java.util.Scanner;

public class Questao2 {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe seu peso: ");
        var peso = scanner.nextDouble();
        System.out.print("Informe sua altura: ");
        var altura = scanner.nextDouble();
        var imc = peso / (altura * altura);

        if (imc <= 18.5) System.out.println("Abaixo do peso");
        else if (imc >= 18.6 && imc <= 24.9) System.out.println("Peso ideal");
        else if (imc >= 25.0 && imc <= 29.9) System.out.println("Levemente acima do peso");
        else if (imc >= 30.0 && imc <= 34.9) System.out.println("Obesidade Grau I");
        else if (imc >= 35.0 && imc <= 39.9) System.out.println("Obesidade Grau II (Severa)");
        else System.out.println("Obesidade III (Mórbida)");
    }
}
