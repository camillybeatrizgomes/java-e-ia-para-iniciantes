package questao_3;

public record Circulo(double raio) implements FormasGeometricas {
    private static final double pi = 3.14;

    @Override
    public double getArea() {
        return pi * (raio * raio);
    }
    
}
