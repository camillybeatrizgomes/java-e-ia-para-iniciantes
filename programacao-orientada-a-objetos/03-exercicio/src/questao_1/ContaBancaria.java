package questao_1;

public class ContaBancaria {
    private double saldo;
    private double limiteChequeEspecial;
    private double valorUsadoChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;

        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }

        this.valorUsadoChequeEspecial = 0;
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public void consultarChequeEspecial() {
        System.out.printf("Limite do cheque especial: R$ %.2f%n", limiteChequeEspecial);
        System.out.printf("Valor usado do cheque especial: R$ %.2f%n", valorUsadoChequeEspecial);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }

        if (valorUsadoChequeEspecial > 0) {
            double taxa = aplicarTaxaChequeEspecial(valorUsadoChequeEspecial);
            double totalDivida = valorUsadoChequeEspecial + taxa;

            if (valor >= totalDivida) {
                valor -= totalDivida;
                System.out.printf("Dívida do cheque especial quitada com taxa de R$ %.2f%n", taxa);
                valorUsadoChequeEspecial = 0;
            } else {
                double valorSemTaxa = valor / 1.2;
                valorUsadoChequeEspecial -= valorSemTaxa;
                System.out.println("Parte da dívida do cheque especial foi paga.");
                return;
            }
        }

        saldo += valor;
        System.out.printf("Depósito realizado. Saldo atual: R$ %.2f%n", saldo);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }

        double totalDisponivel = saldo + (limiteChequeEspecial - valorUsadoChequeEspecial);

        if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque realizado. Novo saldo: R$ %.2f%n", saldo);
        } else if (valor <= totalDisponivel) {
            double restante = valor - saldo;
            saldo = 0;
            valorUsadoChequeEspecial += restante;
            System.out.printf("Saque realizado usando o cheque especial. Valor usado: R$ %.2f%n", restante);
        } else {
            System.out.println("Saldo insuficiente (incluindo o cheque especial).");
        }
    }

    public void pagarBoleto(double valor) {
        System.out.printf("Tentando pagar boleto de R$ %.2f%n", valor);
        sacar(valor);
    }

    public boolean estaUsandoChequeEspecial() {
        return valorUsadoChequeEspecial > 0;
    }

    public static double aplicarTaxaChequeEspecial(double valorUsado) {
        return valorUsado * 0.2;
    }
}
