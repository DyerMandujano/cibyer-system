package pe.com.cybersystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.cybersystem.entity.CompraEntity;
import pe.com.cybersystem.entity.DetalleCompraEntity;

public interface DetalleCompraRepository extends JpaRepository<DetalleCompraEntity, Long> {
	@Query("select co from DetalleCompraEntity co where co.iddetallecompra!=0 ")
	List<CompraEntity> findAllCustom();

}
