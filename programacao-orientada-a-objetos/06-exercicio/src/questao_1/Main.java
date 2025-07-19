package questao_1;

public class Main {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Ingresso(30.0, "Matrix", true);
        MeiaEntrada meia = new MeiaEntrada(30.0, "Matrix", false);
        IngressoFamilia familia = new IngressoFamilia(30.0, "Matrix", true, 4);

        System.out.println("=== Ingresso Normal ===");
        ingressoNormal.exibirInfo();

        System.out.println("\n=== Meia Entrada ===");
        meia.exibirInfo();

        System.out.println("\n=== Ingresso Família ===");
        familia.exibirInfo();
    }
}
