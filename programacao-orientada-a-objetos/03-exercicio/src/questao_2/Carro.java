package questao_2;

public class Carro {

    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O carro já está ligado.");
        } else {
            ligado = true;
            System.out.println("Carro ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado.");
        } else if (velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("Carro desligado com sucesso.");
        } else {
            System.out.println("Você só pode desligar o carro se ele estiver parado e em ponto morto.");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }
        if (marcha == 0) {
            System.out.println("Você não pode acelerar em ponto morto!");
            return;
        }
        if (velocidade >= 120) {
            System.out.println("Velocidade máxima atingida!");
            return;
        }

        int novaVelocidade = velocidade + 1;
        if (!velocidadeCompativelComMarcha(novaVelocidade, marcha)) {
            System.out.println("A marcha atual não permite essa velocidade.");
        } else {
            velocidade = novaVelocidade;
            System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
        }
    }

    public void diminuirVelocidade() {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }
        if (velocidade > 0) {
            velocidade--;
            System.out.println("Diminuindo velocidade. Atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void virar(String direcao) {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para " + direcao);
        } else {
            System.out.println("Você só pode virar com velocidade entre 1 km/h e 40 km/h.");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }
        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida.");
            return;
        }

        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Você só pode trocar uma marcha por vez.");
            return;
        }

        if (!velocidadeCompativelComMarcha(velocidade, novaMarcha)) {
            System.out.println("A velocidade atual não é compatível com essa marcha.");
            return;
        }

        marcha = novaMarcha;
        System.out.println("Marcha atual: " + marcha);
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    private boolean velocidadeCompativelComMarcha(int velocidade, int marcha) {
        switch (marcha) {
            case 0:
                return velocidade == 0;
            case 1:
                return velocidade >= 0 && velocidade <= 20;
            case 2:
                return velocidade >= 21 && velocidade <= 40;
            case 3:
                return velocidade >= 41 && velocidade <= 60;
            case 4:
                return velocidade >= 61 && velocidade <= 80;
            case 5:
                return velocidade >= 81 && velocidade <= 100;
            case 6:
                return velocidade >= 101 && velocidade <= 120;
            default:
                return false;
        }
    }

}
