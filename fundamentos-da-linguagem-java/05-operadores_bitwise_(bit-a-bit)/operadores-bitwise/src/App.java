public class App {
    public static void main(String[] args) {
        var valor1 = 35;
        var binario1 = Integer.toBinaryString(valor1);
        System.out.printf("Primeiro número de operação %s (Representação binária %s)\n", valor1, binario1);

        var valor2 = 5;
        var binario2 = Integer.toBinaryString(valor2);
        System.out.printf("Segundo número da operação %s (Representação binário %s)\n", valor2, binario2);

        var resultado = valor1 >> valor2;
        var binarioResultado = Integer.toBinaryString(resultado);
        System.out.printf("%s >> %s = %s (Representação binária %s)\n", valor1, valor2, resultado, binarioResultado);

        // var resultado = ~valor1;
        // var binarioResultado = Integer.toBinaryString(resultado);
        // System.out.printf("~%s = %s (Representação binária %s)\n", valor1,resultado, binarioResultado);

        /*
            Cálculo do operador OR bit a bit:
            110 (6)
            101 (5)
            ----
            111 (7)

            Sendo 0 falso e 1 verdadeiro, o operador OR retorna verdadeiro se pelo menos um dos bits for verdadeiro.

            Cálculo do operador AND bit a bit:
            110 (6)
            101 (5)
            ----
            100 (4)

            Sendo 0 falso e 1 verdadeiro, o operador AND retorna verdadeiro se ambos os bits forem verdadeiros.

            Cálculo do operador XOR bit a bit:
            110 (6)
            101 (5)
            ----
            011 (3)

            Sendo 0 falso e 1 verdadeiro, o operador XOR retorna verdadeiro se os bits forem diferentes e falso se forem iguais.

            Cálculo do operador << (deslocamento à esquerda):
            1001 (9)
            1000 (8)
            ----
            10010000000 (1152)
            
            O operador << move os bits de um número para a esquerda, e cada vez que move, multiplica o número por 2. O operador << 7 desloca os bits 7 posições para a esquerda, o que é o mesmo que multiplicar por 2^7 = 128.
            
            Cálculo do operador >> (deslocamento à direita):
            100011 (35)
            000010 (5)
            ----
            000001 (1)

            O operador >> move os bits de um número para a direita, e cada vez que move, divide o número por 2. O operador >> 5 desloca os bits 5 posições para a direita.
        */ 
    }
}
