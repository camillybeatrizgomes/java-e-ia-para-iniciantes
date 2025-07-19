public class App {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();

        System.out.println(funcionario instanceof Funcionario);
        System.out.println(gerente instanceof Funcionario);
    }
}
