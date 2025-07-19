package questao_2;

class TelefoneCelular extends Telefone {
    public TelefoneCelular(String numero) {
        super(numero);
    }

    @Override
    public String formatar() {
        String parte = getPartePrincipal();
        if (numero.length() == 11) {
            return "(" + getDDD() + ")" + parte.substring(0, 5) + "-" + parte.substring(5);
        } else {
            return parte.substring(0, 5) + "-" + parte.substring(5);
        }
    }

    @Override
    public TipoTelefone getTipo() {
        return TipoTelefone.CELULAR;
    }
}

