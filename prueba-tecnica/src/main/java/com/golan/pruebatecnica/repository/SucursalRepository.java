package com.golan.pruebatecnica.repository;

import com.golan.pruebatecnica.entity.Cliente;
import com.golan.pruebatecnica.entity.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

/** ClienteRepository
 * @author Julio Cornejo
 * @author julio.cornejo@golan.cl
 * @version 1.0
 * @since 1.0
 */
public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {

    @Query("select suc from Sucursal suc join suc.idCliente c where c.nombre = ?1")
    List<Sucursal> findClient(String nombre);
}
