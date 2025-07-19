package questao_3;

public record Retangulo(double altura, double base) implements FormasGeometricas {

    @Override
    public double getArea() {
        return base * altura;
    }

}
