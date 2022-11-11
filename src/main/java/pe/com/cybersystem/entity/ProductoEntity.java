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
@Entity(name = "ProductoEntity")
@Table(name = "producto")
public class ProductoEntity implements Serializable{

	public static final long serialVersionUID = 1L; 
	
	@Id
	@Column(name = "IdProducto ")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idprod;
	@Column(name = "NombreProducto")
	private String nombreprod;
	@Column(name = "Precio")
	private double precioprod;
	@Column(name = "Stock")
	private int stockprod;
	@Column(name = "Descripcion")
	private String descripcionprod;
	@Column(name = "Estado")
	private boolean estadoprod;
	@Column(name = "Marca")
	private String marcaprod;
	
	@ManyToOne
	@JoinColumn(name = "IdCategoria")
	private CategoriaEntity categoria;
	
}
