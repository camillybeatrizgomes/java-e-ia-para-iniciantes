package questao_1;

public class Ingresso {
    protected double valor;
    protected String nomeFilme;
    protected boolean dublado; // true = dublado, false = legendado

    public Ingresso(double valor, String nomeFilme, boolean dublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    public double getValorReal() {
        return valor;
    }

    public void exibirInfo() {
        String idioma = dublado ? "Dublado" : "Legendado";
        System.out.println("Filme: " + nomeFilme);
        System.out.println("Idioma: " + idioma);
        System.out.println("Valor do ingresso: R$ " + getValorReal());
    }
}
