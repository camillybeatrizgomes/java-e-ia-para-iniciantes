import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int[] codigo = {12, 35};
        System.out.println(codigo.length);
        System.out.println(codigo[0]);
        System.out.println(codigo[1]);
        List<Integer> codigo2 = new ArrayList<>();
        codigo2.add(codigo[0]);
        codigo2.add(codigo[1]);
        codigo2.forEach(System.out::println);
    }
}
