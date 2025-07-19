package questao_2;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", "ana@empresa.com", "1234");
        Vendedor vendedor = new Vendedor("Carlos", "carlos@empresa.com", "abcd");
        Atendente atendente = new Atendente("Beatriz", "bia@empresa.com", "senha");

        gerente.realizarLogin();
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();
        gerente.realizarLogoff();

        vendedor.realizarLogin();
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        vendedor.realizarLogoff();

        atendente.realizarLogin();
        atendente.receberPagamento(100.0);
        atendente.receberPagamento(50.0);
        atendente.fecharCaixa();
        atendente.realizarLogoff();
    }
}
