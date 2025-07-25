import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.IOFilePersistence;

public class App {
    public static void main(String[] args) throws Exception {
        FilePersistence persistence = new IOFilePersistence("user.csv");
        System.out.println(persistence.write("Camilly;camilly@gmail.com;20/02/2003"));
        System.out.println(persistence.findAll());
    }
}
