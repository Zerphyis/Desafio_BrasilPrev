package dev.Zerpyhis.com.Brasilprev.domain.cliente;

import dev.Zerpyhis.com.Brasilprev.domain.planos.Planos;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.List;

public  record DadosCliente(@NotBlank String id,
                            @NotBlank String nome,
                            @NotBlank  String cpf,
                            @NotBlank  String email,
                            @NotBlank  String telefone,
                            @FutureOrPresent LocalDateTime dataNascimento,
                            List<Planos> planos)  {
}
