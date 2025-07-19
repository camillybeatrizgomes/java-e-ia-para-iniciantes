import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Usuario> usuarios = new TreeSet<>(Comparator.comparingInt(Usuario::getId));
        usuarios.add(new Usuario(1, "Camilly"));
        usuarios.add(new Usuario(4, "Maria"));
        usuarios.add(new Usuario(2, "Beatriz"));
        usuarios.add(new Usuario(3, "Gabriela"));

        System.out.println(usuarios);
    }
}
