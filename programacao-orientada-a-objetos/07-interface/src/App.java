public class App {
    public static void main(String[] args) {
        var tocadorDeMusica = new TocadorDeMusica() {

            @Override
            public void tocarMusica() {
                System.out.println("Tocando a música...");
            }

            @Override
            public void pausarMusica() {
                System.out.println("Pausando a música...");
            }

            @Override
            public void pararMusica() {
                System.out.println("Parando a música...");
            }
            
        };
        tocadorDeMusica.tocarMusica();
    }
}
