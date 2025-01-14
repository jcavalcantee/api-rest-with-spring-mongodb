package tech.project.Banco.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class TransactionDTO {

    @NotBlank
    private BigDecimal amount;
    @NotBlank
    private String sender;
    @NotBlank
    private String receiver;
    private LocalDateTime timeStamp;
}
