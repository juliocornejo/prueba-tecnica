package com.golan.pruebatecnica.controller;

import com.golan.pruebatecnica.dto.error.ApiError;
import com.golan.pruebatecnica.dto.error.Error;
import com.golan.pruebatecnica.dto.error.Errors;
import com.golan.pruebatecnica.exception.PruebaTecnicaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

/** Controller Advice de Excepciones
 * @author Julio Cornejo
 * @author julio.cornejo@golan.cl
 * @version 1.0
 * @since 1.0
 */
@ControllerAdvice
@ResponseBody
public class ExceptionControllerAdvice {



	private static final String fieldSeparator = ": ";

	@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
	@ExceptionHandler(PruebaTecnicaException.class)
	public ResponseEntity<ApiError> handlerException(PruebaTecnicaException pce) {

		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(new ApiError(
				String.valueOf(HttpStatus.UNPROCESSABLE_ENTITY.value()), HttpStatus.UNPROCESSABLE_ENTITY.name(),pce.getMessage()));
	}

	@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE)
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Errors> handlerException(Exception e) {
		Errors err = new Errors();
		final List<Error> errors = new ArrayList<>();

		errors.add(
			new Error( String.valueOf(HttpStatus.SERVICE_UNAVAILABLE.value()), "ErrorDeSevicio", "no se ha podido ejecutar la solicitud")
		);
		err.setErrors(errors);


		return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(err);

	}
}