package com.golan.pruebatecnica.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/** PruebaTecnicaRs
 * @author Julio Cornejo
 * @author julio.cornejo@golan.cl
 * @version 1.0
 * @since 1.0
 */

public class PruebaTecnicaRs implements Serializable{
 
	private static final long serialVersionUID = -7138360699068922415L;

	@JsonProperty("nombre cliente")
	private String nombreCliente;

	@JsonProperty("direccion sucursal")
	private String direccionSucursal;

	public PruebaTecnicaRs() {
	}

	public PruebaTecnicaRs(String nombreCliente, String direccionSucursal) {
		this.nombreCliente = nombreCliente;
		this.direccionSucursal = direccionSucursal;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDireccionSucursal() {
		return direccionSucursal;
	}

	public void setDireccionSucursal(String direccionSucursal) {
		this.direccionSucursal = direccionSucursal;
	}
}
