package questao_3;

public record Quadrado(double lado) implements FormasGeometricas {

    @Override
    public double getArea() {
        return lado * lado;
    }

}
