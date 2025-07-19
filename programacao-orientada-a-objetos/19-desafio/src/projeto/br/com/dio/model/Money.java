package projeto.br.com.dio.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Money {

    @Override
    public String toString() {
        return "Money{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        // Adicione os campos relevantes abaixo
        return true;
    }

    @Override
    public int hashCode() {
        // Adicione os campos relevantes abaixo
        return Objects.hash();
    }

    private final List<MoneyAudit> history = new ArrayList<>();

    public List<MoneyAudit> getHistory() {
        return history;
    }

    public Money(final MoneyAudit history) {
        this.history.add(history);
    }

    public void addHistory(final MoneyAudit history){
        this.history.add(history);
    }
}
