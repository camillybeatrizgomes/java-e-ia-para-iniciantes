package questao_3;

public enum TipoCampo {
    TEXTO, DATA, DATA_E_HORA, INTEIRO, PONTO_FLUTUANTE, BOOLEANO, ARRAY, INVALIDO;

    public static TipoCampo fromString(String tipo) {
        return switch (tipo.trim().toLowerCase()) {
            case "texto" -> TEXTO;
            case "data" -> DATA;
            case "data e hora" -> DATA_E_HORA;
            case "números inteiros", "inteiro" -> INTEIRO;
            case "números com pontos flutuantes", "ponto flutuante" -> PONTO_FLUTUANTE;
            case "booleano", "boleanos" -> BOOLEANO;
            case "array" -> ARRAY;
            default -> INVALIDO;
        };
    }
}
