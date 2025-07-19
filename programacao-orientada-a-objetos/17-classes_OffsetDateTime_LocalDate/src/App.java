import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        LocalDateTime localDateTime = localDate.atTime(localTime);
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("hh:mm:ss");
        DateTimeFormatter formatarDataHora = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(formatarData.format(localDate));
        System.out.println(localDate.plus(50, ChronoUnit.DAYS));
        System.out.println(localDate.plusYears(10));
        System.out.println(localDate.minusYears(10));
        System.out.println(formatarHora.format(localTime));
        System.out.println(formatarDataHora.format(localDateTime));
        System.out.println(offsetDateTime.withOffsetSameInstant(ZoneOffset.UTC));
    }
}
