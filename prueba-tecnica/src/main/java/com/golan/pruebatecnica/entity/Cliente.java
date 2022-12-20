package com.golan.pruebatecnica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import java.io.Serializable;

/** Cliente
 * @author Julio Cornejo
 * @author julio.cornejo@golan.cl
 * @version 1.0
 * @since 1.0
 */
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = -6838553923245028853L;

	@Id
	@OrderBy
	@Column(name="id")
	private Integer id;

	@Column(name="nombre", length = 45)
	private String nombre;

	public Cliente() {
	}

	public Cliente(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
