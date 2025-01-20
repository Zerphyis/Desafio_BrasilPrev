package dev.Zerpyhis.com.Brasilprev.domain.cliente;

import dev.Zerpyhis.com.Brasilprev.domain.planos.Planos;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    String nome;
    String cpf;
    String email;
    String telefone;
    LocalDateTime dataNascimento;
    @OneToMany
    List<Planos> planos;

    public Cliente(DadosCliente dados) {
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.dataNascimento =dados.dataNascimento();
        this.planos =dados.planos();
    }

  public Cliente(){

  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Planos> getPlanos() {
        return planos;
    }

    public void setPlanos(List<Planos> planos) {
        this.planos = planos;
    }
}

