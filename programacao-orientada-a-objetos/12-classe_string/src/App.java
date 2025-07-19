public class App {
    public static void main(String[] args) throws Exception {
        var valor = "Java-Javascript-CSS-HTML-C#";
        valor = valor.replace("-", ", ") ;
        System.out.println(valor);
        System.out.println("==================================");
        System.out.println(valor.toLowerCase());
        System.out.println(valor.toUpperCase());
        System.out.println("==================================");
        var letra = "A";
        System.out.println(letra.repeat(3));
        
    }
}
