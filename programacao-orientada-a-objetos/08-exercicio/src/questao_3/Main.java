package questao_3;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        FormasGeometricas formasGeometricas;
        while (true) {
            System.out.println("Escolha a forma geométrica para calcular a área: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("4 - Sair do programa");
            opcao = scanner.nextInt();
            if (opcao == 1){
                formasGeometricas = criandoQuadrado();
            } else if (opcao == 2){
                formasGeometricas = criandoRetangulo();
            } else if (opcao == 3) {
                formasGeometricas = criandoCirculo();
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção Inválida");
                continue;
            }
            System.out.println("O Resultado do cálculo da área foi de "+ formasGeometricas.getArea());
        }
    }
    private static FormasGeometricas criandoQuadrado(){
        System.out.print("Informe o tamanho do lado: ");
        var lado = scanner.nextDouble();
        return new Quadrado(lado);
    }

    private static FormasGeometricas criandoRetangulo(){
        System.out.print("Informe a base: ");
        var base = scanner.nextDouble();
        System.out.print("Informe a altura: ");
        var altura = scanner.nextDouble();
        return new Retangulo(altura, base);
    }

    private static FormasGeometricas criandoCirculo(){
        System.out.print("Informe o raio: ");
        var raio = scanner.nextDouble();
        return new Circulo(raio);
    }
}