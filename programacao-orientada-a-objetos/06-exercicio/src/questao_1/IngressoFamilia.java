package questao_1;

public class IngressoFamilia extends Ingresso {
    private int quantidadePessoas;

    public IngressoFamilia(double valor, String nomeFilme, boolean dublado, int quantidadePessoas) {
        super(valor, nomeFilme, dublado);
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double getValorReal() {
        double total = valor * quantidadePessoas;
        if (quantidadePessoas > 3) {
            total *= 0.95; // aplica 5% de desconto
        }
        return total;
    }
}

