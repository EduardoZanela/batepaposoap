package br.com.batepapo.batepapouserssoapwebservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.batepapo.batepapouserssoapwebservices.entity.Usuario;
import br.com.batepapo.batepapouserssoapwebservices.entity.UsuarioTopico;
import br.com.batepapo.batepapouserssoapwebservices.entity.UsuarioTopicoKey;

@Repository
public interface UsuarioTopicoRepository extends CrudRepository<UsuarioTopico, UsuarioTopicoKey> {
	
	//@Query(name="",value="SELECT DISTINCT u.* FROM usuario u INNER JOIN Usuario_topico t ON u.codusuario = t.codusuario and t.idtopico = ?1", nativeQuery=true)
	@Query("SELECT DISTINCT NEW br.com.batepapo.batepapouserssoapwebservices.entity.Usuario(u.codUsuario, u.nome, u.iPaddress) FROM Usuario u INNER JOIN UsuarioTopico t ON u.codUsuario = t.codUsuario and t.idTopico = ?1")
	List<Usuario> interessadosNoTopico(long topico);
	
}
