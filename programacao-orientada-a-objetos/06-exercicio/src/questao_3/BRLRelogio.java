package questao_3;

public non-sealed class BRLRelogio extends Relogio {

    @Override
    public Relogio conversao(Relogio relogio) {
        this.segundos = relogio.getSegundos();
        this.minutos = relogio.getMinutos();
        switch (relogio) {
            case USRelogio usRelogio -> {
                this.horas = (usRelogio.getIndicadorDePeriodo().equals("PM")) ?
                                usRelogio.getHoras() + 12 :
                                usRelogio.getHoras();
            }
            case BRLRelogio brlRelogio -> {
                this.horas = brlRelogio.getHoras();
            }
        }
        return this;
    }
    
}
