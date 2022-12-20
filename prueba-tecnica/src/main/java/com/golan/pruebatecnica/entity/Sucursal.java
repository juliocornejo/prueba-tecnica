package com.golan.pruebatecnica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

/** Sucursal
 * @author Julio Cornejo
 * @author julio.cornejo@golan.cl
 * @version 1.0
 * @since 1.0
 */
@Entity
@Table(name="sucursal")
public class Sucursal implements Serializable{

	private static final long serialVersionUID = -6838553923245028853L;

	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="direccion", length = 100)
	private String direccion;

	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente idCliente;

	public Sucursal() {
	}

	public Sucursal(Integer id, String direccion, Cliente idCliente) {
		this.id = id;
		this.direccion = direccion;
		this.idCliente = idCliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}
}
	
