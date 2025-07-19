package questao_3;

import java.util.List;

public interface Formatador {
    String gerarJson(List<Campo> campos);
    String gerarXml(List<Campo> campos);
    String gerarYaml(List<Campo> campos);
}

