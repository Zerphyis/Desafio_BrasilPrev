package dev.Zerpyhis.com.Brasilprev.domain.planos;

import ch.qos.logback.core.model.INamedModel;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.time.LocalDateTime;


public class Planos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    String nome;
    Double valorMinimo;
    Double taxaAdimissao;
    Integer periodoContribuicao;
    LocalDateTime dataNascimento;

}
