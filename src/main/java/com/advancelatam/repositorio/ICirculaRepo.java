/**
 * 
 */
package com.advancelatam.repositorio;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.advancelatam.modelo.Circula;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Repository
public interface ICirculaRepo  {
	List<Circula> buscarPorPlaca(char ultimoDigito);
}
