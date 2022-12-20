package com.golan.pruebatecnica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**PruebaTecnicaApplication
 * @author Julio Cornejo
 * @author julio.cornejo@golan.cl
 * @version 1.0
 * @since 1.0
 */
@SpringBootApplication
@EnableJpaRepositories
@EntityScan({"com.golan.pruebatecnica.entity"})
public class PruebaTecnicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaTecnicaApplication.class, args);
	}

}
