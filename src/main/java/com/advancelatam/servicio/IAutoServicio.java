/**
 * 
 */
package com.advancelatam.servicio;

import com.advancelatam.dto.ConsultaDto;
import com.advancelatam.modelo.Auto;

/**
 * @author gustavoefrainparcosanchez
 *
 */
public interface IAutoServicio extends ICRUD<Auto, Integer> {

	public ConsultaDto validarCirculacion(ConsultaDto consultaDto) throws Exception;

}
