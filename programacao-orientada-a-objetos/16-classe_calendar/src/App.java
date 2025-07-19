import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        var calendar = Calendar.getInstance();
        DateFormat formatar = new SimpleDateFormat("dd/MM/yyyy - HH:mm Z");
        System.out.println(formatar.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    }
}
