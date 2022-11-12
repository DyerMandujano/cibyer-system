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
@Entity(name = "CategoriaEntity")
@Table(name = "categoria")
public class CategoriaEntity implements Serializable{

	public static final long serialVersionUID = 1L; 
	
	@Id
	@Column(name = "idcategoria")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcat;
	@Column(name = "nombrecategoria")
	private String nombrecat;
	@Column(name = "estado")
	private boolean estadocat;
	
}
