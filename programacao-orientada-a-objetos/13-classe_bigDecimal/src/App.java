import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {
    public static void main(String[] args) throws Exception {
        var valor1 = new BigDecimal("0.1");
        var valor2 = new BigDecimal("0.2");
        System.out.println(valor1.add(valor2));
        System.out.println("=====");

        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.2")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.3")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.4")));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.5")));
        System.out.println("=====");

        var valor3 = new BigDecimal("34.18");
        var valor4 = new BigDecimal("11.56");
        System.out.println(valor4.divide(valor3, 3, RoundingMode.HALF_UP));
    }
}
