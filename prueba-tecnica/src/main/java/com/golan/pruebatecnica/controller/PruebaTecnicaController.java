package com.golan.pruebatecnica.controller;

import com.golan.pruebatecnica.dto.response.PruebaTecnicaRs;
import com.golan.pruebatecnica.service.PruebaTecnicaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/** Controller de PruebaTecnicaController
 * @author Julio Cornejo
 * @author julio.cornejo@golan.cl
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping("${servicio.path}")
@Tag(name = "${servicio.name}", description = "${servicio.description}")
public class PruebaTecnicaController implements IPruebaTecnicaController {

	@Autowired
	private PruebaTecnicaService pruebaTecnicaService;

	@GetMapping(value = "${servicio.app.pruebaTecnica.uri}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<PruebaTecnicaRs>> pruebaTecnica(@Valid @PathVariable("nombre") String nombre)  {
		/**200 - CREATED**/
		return new ResponseEntity<> (pruebaTecnicaService.pruebaTecnica(nombre), HttpStatus.OK);
	}

}