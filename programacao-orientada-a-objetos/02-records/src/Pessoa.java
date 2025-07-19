// Record é um tipo especial de classe em Java, imutável (não pode ser alterado) e usado para armazenar dados.
// Ele já gera automaticamente métodos como equals, hashCode e toString.
public record Pessoa(String nome, int idade) {
    // Os atributos do record são definidos no cabeçalho, na inicialização do record.
}
