package projeto.br.com.dio.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public record MoneyAudit(
    UUID transactionId,
    BanckService targetService,
    String description,
    OffsetDateTime createAt) {
    
}
