package questao_2;

public class Atendente extends Usuario {
    private double valorCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false); // admin sempre false
        this.valorCaixa = 0.0;
    }

    public void receberPagamento(double valor) {
        valorCaixa += valor;
        System.out.println(nome + " recebeu um pagamento de R$ " + valor + ". Total em caixa: R$ " + valorCaixa);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado com valor total de R$ " + valorCaixa);
        valorCaixa = 0.0;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }
}

