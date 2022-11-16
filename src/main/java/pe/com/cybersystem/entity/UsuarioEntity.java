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
@Entity(name = "UsuarioEntity")
@Table(name = "usuario")
public class UsuarioEntity implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	@Column(name = "Idcliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Apellido")
	private String apellido;
	@Column(name = "Sexo")
	private String sexo;
	@Column(name = "Email")
	private String email;
	@Column(name = "FechaNacimiento")
	private String fecha;
	@Column(name = "Documento")
	private String documento;
	@Column(name = "Estado")
	private boolean estado;

}
