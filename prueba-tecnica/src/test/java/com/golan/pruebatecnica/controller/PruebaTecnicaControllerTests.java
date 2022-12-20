package com.golan.pruebatecnica.controller;

import com.golan.pruebatecnica.PruebaTecnicaApplication;
import com.golan.pruebatecnica.entity.Cliente;
import com.golan.pruebatecnica.entity.Sucursal;
import com.golan.pruebatecnica.exception.PruebaTecnicaException;
import com.golan.pruebatecnica.repository.SucursalRepository;
import com.golan.pruebatecnica.service.PruebaTecnicaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.Times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

@SpringBootTest(classes = PruebaTecnicaApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@EnableAutoConfiguration

class PruebaTecnicaControllerTests {

	private static final int UNA_VEZ = 1;
	@Autowired
	private MockMvc mvc;

	@MockBean
	private SucursalRepository sucursalRepository;

	@Test
	void pruebaTecnica200() throws Exception {

		String nombre = "prueba1";

		List<Sucursal> list = sucursal();

		Mockito.when(this.sucursalRepository.findClient(anyString())).thenReturn(list);

		String url = "/golan-api/v1/prueba/".concat(nombre);
		String response = mvc
				.perform(MockMvcRequestBuilders.get(url))
				.andExpect(MockMvcResultMatchers.status().isOk()).andReturn().getResponse().getContentAsString();

		assertThat(response).contains("direccion");

	}

	@Test
	void pruebaTecnicaEmpty422() throws Exception {

		String nombre = "prueba1";

		Mockito.when(this.sucursalRepository.findClient(anyString())).thenReturn(Arrays.asList());

		String url = "/golan-api/v1/prueba/".concat(nombre);
		String response = mvc
				.perform(MockMvcRequestBuilders.get(url))
				.andExpect(MockMvcResultMatchers.status().isUnprocessableEntity()).andReturn().getResponse().getContentAsString();


		assertThat(response).contains("422");

	}

	@Test
	void pruebaTecnicaException503() throws Exception {

		String nombre = "prueba1";

		Mockito.when(this.sucursalRepository.findClient(anyString())).thenThrow(new RuntimeException());

		String url = "/golan-api/v1/prueba/".concat(nombre);
		String response = mvc
				.perform(MockMvcRequestBuilders.get(url))
				.andExpect(MockMvcResultMatchers.status().isServiceUnavailable()).andReturn().getResponse().getContentAsString();

		assertThat(response).contains("503");

	}



	private List<Sucursal> sucursal(){
		return Arrays.asList(new Sucursal(1, "direccion", new Cliente(1, "nombre"))) ;
	}
}
