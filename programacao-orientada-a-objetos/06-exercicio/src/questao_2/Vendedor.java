package questao_2;

public class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false); // admin sempre false
        this.quantidadeVendas = 0;
    }

    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println(nome + " realizou uma venda. Total de vendas: " + quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("Total de vendas realizadas por " + nome + ": " + quantidadeVendas);
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }
}

