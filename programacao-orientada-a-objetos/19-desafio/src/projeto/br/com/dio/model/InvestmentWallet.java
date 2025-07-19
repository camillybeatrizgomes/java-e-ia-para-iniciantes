package projeto.br.com.dio.model;

import static projeto.br.com.dio.model.BanckService.INVESTIMENT;

import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.stream.Stream;

public class InvestmentWallet extends Wallet{
    @Override
    public String toString() {
        return super.toString() + "InvestmentWallet{" +
                "investment=" + investment +
                ", account=" + account +
                '}';
    }

    private final Investment investment;
    private final AccountWallet account;

    public Investment getInvestment() {
        return investment;
    }

    public AccountWallet getAccount() {
        return account;
    }

    public InvestmentWallet(final Investment investment, final AccountWallet account, final long amount) {
        super(INVESTIMENT);
        this.investment = investment;
        this.account = account;
        addMoney(account.reduceMoney(amount), getService(), "investimento");
    }

    public void updateAmount(final long percent){
        var amount = getFunds() * percent / 100;
        var history = new MoneyAudit(UUID.randomUUID(), getService(), "rendimentos", OffsetDateTime.now());
        var money = Stream.generate(() -> new Money(history)).limit(amount).toList();
        this.money.addAll(money);
    }

}
