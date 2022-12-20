package com.golan.pruebatecnica.service;

import com.golan.pruebatecnica.dto.response.PruebaTecnicaRs;
import com.golan.pruebatecnica.entity.Cliente;
import com.golan.pruebatecnica.entity.Sucursal;
import com.golan.pruebatecnica.exception.PruebaTecnicaException;
import com.golan.pruebatecnica.repository.SucursalRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.Times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

@SpringBootTest
class PruebaTecnicaServiceTests {

	private static final int UNA_VEZ = 1;
	@Autowired
	private PruebaTecnicaService pruebaTecnicaService;

	@MockBean
	private SucursalRepository sucursalRepository;

	@Test
	void pruebaTecnica200() {

		//ACT
		List<Sucursal> listSucursal = sucursal();
		//ARRANGE
		Mockito.when(this.sucursalRepository.findClient(anyString())).thenReturn(listSucursal);

		List<PruebaTecnicaRs> response = this.pruebaTecnicaService.pruebaTecnica("");

		//ASSERT
		verify(this.sucursalRepository, new Times(UNA_VEZ))
				.findClient(anyString());

		Assertions.assertNotNull(response);
	}

	@Test
	void pruebaTecnicaRetNull() {


		Mockito.when(this.sucursalRepository.findClient(anyString())).thenReturn(Arrays.asList());

		Assertions.assertThrows(
				PruebaTecnicaException.class,
				() -> pruebaTecnicaService.pruebaTecnica(""),
				"Expected doThing() to throw, but it didn't"
		);

		verify(this.sucursalRepository, new Times(UNA_VEZ))
				.findClient(anyString());
	}

	@Test
	void pruebaTecnicaException() {

		//ACT
		List<Sucursal> listSucursal = sucursal();

		Mockito.when(this.sucursalRepository.findClient(anyString())).thenThrow(new RuntimeException());

		Assertions.assertThrows(
				Exception.class,
				() -> pruebaTecnicaService.pruebaTecnica(""),
				"Expected doThing() to throw, but it didn't"
		);

		verify(this.sucursalRepository, new Times(UNA_VEZ))
				.findClient(anyString());
	}

	private List<Sucursal> sucursal(){
		return Arrays.asList(new Sucursal(1, "direccion", new Cliente(1, "nombre"))) ;
	}
}
