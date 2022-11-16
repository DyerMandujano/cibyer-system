package pe.com.cybersystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "RolEntity")
@Table(name = "rol")
public class RolEntity implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name = "IdRol")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(name = "Rol")
	private String rol;
	@Column(name = "Estado")
	private boolean estado;
	
	

}
