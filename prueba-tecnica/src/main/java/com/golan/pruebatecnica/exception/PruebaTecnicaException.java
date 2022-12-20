package com.golan.pruebatecnica.exception;

import java.io.Serializable;

/** PruebaTecnicaException
 * @author Julio Cornejo
 * @author julio.cornejo@golan.cl
 * @version 1.0
 * @since 1.0
 */

public class PruebaTecnicaException extends RuntimeException implements Serializable{
	
	private static final long serialVersionUID = 7672936385153673862L;
	
	protected String codigoPruebaTecnicaException;

	public PruebaTecnicaException(){
		super();
	}

	public PruebaTecnicaException(String codigoPruebaTecnicaException, String message){
		super(message);
		this.codigoPruebaTecnicaException = codigoPruebaTecnicaException;
	}

	public String getCodigoPruebaTecnicaException() {
		return codigoPruebaTecnicaException;
	}

	public void setCodigoPruebaTecnicaException(String codigoPruebaTecnicaException) {
		this.codigoPruebaTecnicaException = codigoPruebaTecnicaException;
	}
}
