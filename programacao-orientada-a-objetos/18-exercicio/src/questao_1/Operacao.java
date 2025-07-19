package questao_1;

import java.util.stream.LongStream;

public enum Operacao {
    SUM(n -> LongStream.of(n).reduce(0, Long::sum), "+"), 
    SUBTRACTION(n -> LongStream.of(n).reduce(0, (n1, n2) -> n1 - n2),"-");

    private final Calculadora chamadaDaOperacao;

    private final String sinal;

    private Operacao(Calculadora chamadaDaOperacao, String sinal) {
        this.chamadaDaOperacao = chamadaDaOperacao;
        this.sinal = sinal;
    }
    
    public Calculadora getChamadaDaOperacao() {
        return chamadaDaOperacao;
    }
    
    public String getSinal() {
        return sinal;
    }
}
