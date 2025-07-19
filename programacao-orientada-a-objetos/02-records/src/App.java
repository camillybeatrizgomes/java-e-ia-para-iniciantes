public class App {
    public static void main(String[] args) throws Exception {
        var pessoa = new Pessoa("Camilly", 22);
        System.out.println(pessoa);
        System.out.println(pessoa.nome());
    }
}
