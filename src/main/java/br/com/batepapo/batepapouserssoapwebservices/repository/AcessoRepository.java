package br.com.batepapo.batepapouserssoapwebservices.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.batepapo.batepapouserssoapwebservices.entity.Acesso;
import br.com.batepapo.batepapouserssoapwebservices.entity.AcessoKey;

public interface AcessoRepository extends CrudRepository<Acesso, AcessoKey> {
	
}
