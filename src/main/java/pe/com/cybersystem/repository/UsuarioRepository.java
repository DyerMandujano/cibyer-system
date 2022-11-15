package pe.com.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.negocio.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
	@Query("select u from UsuarioEntity u where u.estado=1")
	List<UsuarioEntity>findAllCustom();
}
