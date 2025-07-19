public class App {
    public static void main(String[] args) {
        var pessoa = new Pessoa("Camilly", 22);
        pessoa.mensagemBoasVindas(pessoa); // chamada do método estático
        System.out.printf("%s, sua idade é %s", pessoa.getNome(), pessoa.getIdade());
    }
}
