package questao_2;

class TelefoneFixo extends Telefone {
    public TelefoneFixo(String numero) {
        super(numero);
    }

    @Override
    public String formatar() {
        String parte = getPartePrincipal();
        if (numero.length() == 10) {
            return "(" + getDDD() + ")" + parte.substring(0, 4) + "-" + parte.substring(4);
        } else {
            return parte.substring(0, 4) + "-" + parte.substring(4);
        }
    }

    @Override
    public TipoTelefone getTipo() {
        return TipoTelefone.FIXO;
    }
}
