package com.golan.pruebatecnica.service;

import com.golan.pruebatecnica.dto.response.PruebaTecnicaRs;
import com.golan.pruebatecnica.entity.Sucursal;
import com.golan.pruebatecnica.exception.PruebaTecnicaException;
import com.golan.pruebatecnica.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/** PruebaTecnicaService
 * @author Julio Cornejo
 * @author julio.cornejo@golan.cl
 * @version 1.0
 * @since 1.0
 */
@Service
public class PruebaTecnicaService {

	@Autowired
	private SucursalRepository sucursalRepository;

	private static final char isCashBackExist = 'S';
	private static final char isCashBackNotExist = 'N';

	public  List<PruebaTecnicaRs> pruebaTecnica(String nombre){

		 return Optional.ofNullable(
				 sucursalRepository.findClient(nombre.toUpperCase().trim())
				 	.stream()
				 	.map(cs -> new PruebaTecnicaRs(cs.getIdCliente().getNombre(), cs.getDireccion()))
				 	.collect(Collectors.toList()))
				 .filter(a -> !a.isEmpty())
				 .orElseThrow(() -> new PruebaTecnicaException("codigo", "error"));

	}



}
