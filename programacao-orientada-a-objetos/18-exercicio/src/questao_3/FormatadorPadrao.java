package questao_3;

import java.util.List;

public class FormatadorPadrao implements Formatador {

    @Override
    public String gerarJson(List<Campo> campos) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for (Campo c : campos) {
            sb.append("  \"").append(c.getNome()).append("\": ");
            if (c.getTipo() == TipoCampo.TEXTO || c.getTipo() == TipoCampo.DATA || c.getTipo() == TipoCampo.DATA_E_HORA) {
                sb.append("\"").append(c.getValor()).append("\"");
            } else if (c.getTipo() == TipoCampo.ARRAY) {
                sb.append("[");
                List<?> lista = (List<?>) c.getValor();
                for (int i = 0; i < lista.size(); i++) {
                    sb.append("\"").append(lista.get(i)).append("\"");
                    if (i < lista.size() - 1) sb.append(", ");
                }
                sb.append("]");
            } else {
                sb.append(c.getValor());
            }
            sb.append(",\n");
        }
        if (!campos.isEmpty()) sb.setLength(sb.length() - 2); // remove vírgula final
        sb.append("\n}");
        return sb.toString();
    }

    @Override
    public String gerarXml(List<Campo> campos) {
        StringBuilder sb = new StringBuilder();
        sb.append("<dados>\n");
        for (Campo c : campos) {
            sb.append("  <").append(c.getNome()).append(">");
            if (c.getTipo() == TipoCampo.ARRAY) {
                sb.append("\n");
                List<?> lista = (List<?>) c.getValor();
                for (Object o : lista) {
                    sb.append("    <item>").append(o).append("</item>\n");
                }
                sb.append("  ");
            } else {
                sb.append(c.getValor());
            }
            sb.append("</").append(c.getNome()).append(">\n");
        }
        sb.append("</dados>");
        return sb.toString();
    }

    @Override
    public String gerarYaml(List<Campo> campos) {
        StringBuilder sb = new StringBuilder();
        for (Campo c : campos) {
            sb.append(c.getNome()).append(": ");
            if (c.getTipo() == TipoCampo.ARRAY) {
                sb.append("\n");
                List<?> lista = (List<?>) c.getValor();
                for (Object o : lista) {
                    sb.append("  - ").append(o).append("\n");
                }
            } else {
                sb.append(c.getValor()).append("\n");
            }
        }
        return sb.toString();
    }

}
