import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        var data = new Date();
        DateFormat formatar = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        System.out.println(data);
        System.out.println(formatar.format(data));
        
    }
}
