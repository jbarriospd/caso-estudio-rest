package co.edu.poli.estudiantes.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clientes {
	@Id
	@Column(name="id_Clientes")
	private Long idClientes;
	
	private String nom_Clientes;
	
	public Clientes() {}

	public Long getIdClientes() {
		return idClientes;
	}

	public void setIdClientes(Long idClientes) {
		this.idClientes = idClientes;
	}

	public String getNom_Clientes() {
		return nom_Clientes;
	}

	public void setNom_Clientes(String nom_Clientes) {
		this.nom_Clientes = nom_Clientes;
	}



}