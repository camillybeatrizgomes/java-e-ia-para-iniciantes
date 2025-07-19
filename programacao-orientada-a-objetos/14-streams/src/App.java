import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        var valor = Stream.of("Maria", "José", "Marcela", "Fernanda", "João", "Gabriel")
            .peek(System.out::println)
            .filter(nome -> nome.endsWith("a"))
            .toList();

        System.out.println(valor);

        var numeros = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 7)
                      .distinct().toList();

        System.out.println(numeros);
    }
}
