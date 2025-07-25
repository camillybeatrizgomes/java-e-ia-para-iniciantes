import br.com.dio.persistence.FilePersistence;
import br.com.dio.persistence.NIO2FilePersistence;

public class App {
    public static void main(String[] args) throws Exception {
        FilePersistence persistence = new NIO2FilePersistence("user.csv");
    }
}
