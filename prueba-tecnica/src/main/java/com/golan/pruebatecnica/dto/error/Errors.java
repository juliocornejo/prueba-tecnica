package com.golan.pruebatecnica.dto.error;

import java.io.Serializable;
import java.util.List;

/** Error
 * @author Julio Cornejo
 * @author julio.cornejo@golan.cl
 * @version 1.0
 * @since 1.0
 */

public class Errors implements Serializable {

	private static final long serialVersionUID = -1360021176413807221L;

	private List<Error> errors;

	public Errors() {
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}
}
