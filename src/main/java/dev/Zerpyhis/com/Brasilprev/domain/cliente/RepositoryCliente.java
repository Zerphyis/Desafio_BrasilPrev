package dev.Zerpyhis.com.Brasilprev.domain.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCliente extends JpaRepository<Cliente,String> {
}
