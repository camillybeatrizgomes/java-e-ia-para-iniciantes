package questao_3;

public class Main {
    public static void main(String[] args) {
        Relogio brlRelogio = new BRLRelogio();
        brlRelogio.setSegundos(0);
        brlRelogio.setMinutos(0);
        brlRelogio.setHoras(13);

        System.out.println(brlRelogio.getTime());
        System.out.println(new USRelogio().conversao(brlRelogio).getTime());
    }
}
