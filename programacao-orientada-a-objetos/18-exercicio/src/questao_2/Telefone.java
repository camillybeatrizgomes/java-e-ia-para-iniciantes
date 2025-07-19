package questao_2;

abstract class Telefone implements Formatavel {
    protected String numero;

    public Telefone(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    protected String getDDD() {
        return numero.length() > 8 ? numero.substring(0, 2) : "";
    }

    protected String getPartePrincipal() {
        return numero.length() > 8 ? numero.substring(2) : numero;
    }
}