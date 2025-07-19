package questao_3;
import java.util.Scanner;

public class App {
    private final static Scanner scanner = new Scanner(System.in);
    private final static MaquinaDeBanho maquinaDeBanho = new MaquinaDeBanho();
    public static void main(String[] args) {
        var opcao = -1;

        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água na máquina");
            System.out.println("5 - Verificar shampoo na máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet na máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> maquinaDeBanho.darBanho();
                case 2 -> definirAgua();
                case 3 -> definirShampoo();
                case 4 -> verificarAgua();
                case 5 -> verificarShampoo();
                case 6 -> VerificarSeTemPetNaMaquina();
                case 7 -> colocarPetNaMaquina();
                case 8 -> maquinaDeBanho.removerPet();
                case 9 -> maquinaDeBanho.lavar();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }

    private static void definirAgua(){
        System.out.println("Tentando colocar água na máquina.");
        maquinaDeBanho.adicionarAgua();
    }

    private static void definirShampoo(){
        System.out.println("Tentando colocar shampoo na máquina.");
        maquinaDeBanho.adicionarShampoo();
    }

    private static void verificarAgua(){
        var quantidadeDeAgua = maquinaDeBanho.getAgua();
        System.out.println("A máquina está no momento com "+ quantidadeDeAgua +" litro(s) de água.");
    }

    private static void verificarShampoo(){
        var quantidadeDeShampoo = maquinaDeBanho.getShampoo();
        System.out.println("A máquina está no momento com "+ quantidadeDeShampoo +" litro(s) de shampoo.");
    }

    private static void VerificarSeTemPetNaMaquina() {
        var temPet = maquinaDeBanho.temPet();
        System.out.println(temPet ? "Tem pet na máquina":"Não tem pet na máquina");
    }

    public static void colocarPetNaMaquina() {
        var nome = "";
        while (nome == null || nome.isEmpty()){
            System.out.print("Informe o nome do pet: ");
            nome = scanner.next();
        }
        var pet = new Pet(nome);
        maquinaDeBanho.setPet(pet);
        System.out.println("O pet "+ pet.getNome() + " foi colocado na máquina.");
    }

}
