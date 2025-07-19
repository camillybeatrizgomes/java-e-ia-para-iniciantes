public class App {
    public static void main(String[] args) throws Exception {
        Funcionario gerente = new Gerente();
        gerente.setNome("Camilly");
        
        System.out.println(gerente.getNome());
    }
}
