package questao_3;

public non-sealed class USRelogio extends Relogio {
    private String indicadorDePeriodo;

    public String getIndicadorDePeriodo() {
        return indicadorDePeriodo;
    }

    public void setIndicadorDePeriodo(String indicadorDePeriodo) {
        this.indicadorDePeriodo = indicadorDePeriodo;
    }

    public void aposMeioDia(){
        this.indicadorDePeriodo = "PM";
    }

    public void antesMeioDia(){
        this.indicadorDePeriodo = "AM";
    }

    public void setHoras(int horas) {
        antesMeioDia();
        if ((horas > 12) && (horas <= 23)) {
            aposMeioDia();
            this.horas = horas - 12;
        } else if (horas >= 24) {
            this.horas = 0;
        } else {
            this.horas = horas;
        }
    }

    @Override
    Relogio conversao(Relogio relogio) {
        this.segundos = relogio.getSegundos();
        this.minutos = relogio.getMinutos();
        switch (relogio) {
            case USRelogio usRelogio -> {
                this.horas = usRelogio.getHoras();
                this.indicadorDePeriodo = usRelogio.getIndicadorDePeriodo();
            }
            case BRLRelogio brlRelogio -> this.setHoras(brlRelogio.getHoras());
        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.indicadorDePeriodo;
    }
}
