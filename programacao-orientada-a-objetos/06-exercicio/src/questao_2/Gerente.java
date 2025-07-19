package questao_2;

public class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true); // admin sempre true
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório financeiro gerado pelo gerente " + nome);
    }

    public void consultarVendas() {
        System.out.println("Consultando vendas (acesso de gerente " + nome + ")");
    }
}

