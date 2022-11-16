package pe.com.cybersystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "EmpleadoEntity")
@Table(name = "empleado")

public class EmpleadoEntity implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name = "IdEmpleado")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Apellido")
	private String apellido;
	@Column(name = "DNI")
	private String dni;
	@Column(name = "Estado")
	private boolean estado;
	@ManyToOne
	@JoinColumn(name = "IdRol",nullable = false)
	private RolEntity rol;


}
