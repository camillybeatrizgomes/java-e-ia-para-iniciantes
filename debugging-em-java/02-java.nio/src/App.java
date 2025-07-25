import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.NIOFilePersistence;

public class App {
    public static void main(String[] args) throws Exception {
        FilePersistence persistence = new NIOFilePersistence("user.csv");
        System.out.println(persistence.write("Camilly;camilly@gmail.com;20/02/2003"));
        
    }
}
