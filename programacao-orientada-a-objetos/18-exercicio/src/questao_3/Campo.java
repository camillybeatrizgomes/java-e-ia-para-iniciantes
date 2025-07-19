package questao_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Campo {
    private String nome;
    private Object valor;
    private TipoCampo tipo;

    public Campo(String nome, String valorStr, TipoCampo tipo) {
        this.nome = nome.trim();
        this.tipo = tipo;
        this.valor = converterValor(valorStr.trim(), tipo);
    }

    private Object converterValor(String valorStr, TipoCampo tipo) {
        try {
            return switch (tipo) {
                case TEXTO -> valorStr;
                case DATA -> LocalDate.parse(valorStr);
                case DATA_E_HORA -> LocalDateTime.parse(valorStr);
                case INTEIRO -> Integer.parseInt(valorStr);
                case PONTO_FLUTUANTE -> Double.parseDouble(valorStr);
                case BOOLEANO -> Boolean.parseBoolean(valorStr.toLowerCase());
                case ARRAY -> List.of(valorStr.split(","));
                default -> "Tipo inválido";
            };
        } catch (Exception e) {
            return "Erro ao converter";
        }
    }

    public String getNome() {
        return nome;
    }

    public Object getValor() {
        return valor;
    }

    public TipoCampo getTipo() {
        return tipo;
    }
}

