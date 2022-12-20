package com.golan.pruebatecnica.controller;

import com.golan.pruebatecnica.dto.error.Errors;
import com.golan.pruebatecnica.dto.response.PruebaTecnicaRs;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;

import java.util.List;

/** Interfaz de Controller
 * @author Julio Cornejo
 * @author julio.cornejo@golan.cl
 * @version 1.0
 * @since 1.0
 */
public interface IPruebaTecnicaController {

    @ApiResponses(value = {
            @ApiResponse(responseCode = "422", description = "${swagger.respuestas.422.description}", content = @Content(schema = @Schema(implementation = Errors.class))),
            @ApiResponse(responseCode = "503", description = "${swagger.respuestas.503.description}", content = @Content(schema = @Schema(implementation = Errors.class))),
            @ApiResponse(responseCode = "200", description = "${swagger.respuestas.200.description}", content = @Content(schema = @Schema(implementation = PruebaTecnicaRs.class)))
    })
     ResponseEntity<List<PruebaTecnicaRs>> pruebaTecnica(String nombre);
}
