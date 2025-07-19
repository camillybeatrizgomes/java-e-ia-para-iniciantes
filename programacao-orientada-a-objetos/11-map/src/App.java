import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Usuario> usuarios = new HashMap<>();
        usuarios.put("camilly@gmail.com", new Usuario("Camilly", 22));
        usuarios.put("beatriz@gmail.com", new Usuario("Beatriz", 25));
        usuarios.put("natalia@gmail.com", new Usuario("Natalia", 33));
        System.out.println(usuarios);
        System.out.println("====================================");
        usuarios.keySet().forEach(System.out::println);
        System.out.println("====================================");
        usuarios.values().forEach(System.out::println);
        System.out.println("====================================");
        System.out.println(usuarios.containsValue(new Usuario("Gabriela", 31)));
        System.out.println(usuarios.containsValue(new Usuario("Beatriz", 25)));
        System.out.println("====================================");
        System.out.println("Remoção: "+usuarios.remove("natalia@gmail.com", new Usuario("Natalia", 33)));
        System.out.println(usuarios);
        System.out.println("====================================");
        System.out.println(usuarios.getOrDefault("beatriz@gmail.com", null));
    }
}
