package projeto.br.com.dio.repository;

import static projeto.br.com.dio.model.BanckService.ACCOUNT;

import projeto.br.com.dio.exception.NoFundsEnoughException;
import projeto.br.com.dio.model.AccountWallet;
import projeto.br.com.dio.model.Money;
import projeto.br.com.dio.model.MoneyAudit;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public final class CommonsRepository {

    private CommonsRepository() {
        // Construtor privado impede instanciamento externo
    }

    public static void checkFundsForTransaction(final AccountWallet source, final long amount){
        if(source.getFunds() < amount){
            throw new NoFundsEnoughException("Sua conta não tem dinheiro o suficiente para realizar essa transação");
        }
    }

    public static List<Money> generateMoney(final UUID transactionId, final long funds, final String description) {
        var history = new MoneyAudit(transactionId, ACCOUNT, description, OffsetDateTime.now());
        return Stream.generate(() -> new Money(history)).limit(funds).toList();
    }

}
