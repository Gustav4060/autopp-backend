/**
 * 
 */
package com.advancelatam.controlador;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advancelatam.dto.ConsultaDto;
import com.advancelatam.servicio.IAutoServicio;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@RestController
@RequestMapping("/consultas")
public class ConsultaControlador {
	@Autowired
	private IAutoServicio servicio;

	@Autowired
	private ModelMapper mapper;

	/**
	 * 
	 * @param dtoRequest
	 * @return
	 * @throws Exception
	 */
	@PostMapping
	public ResponseEntity<ConsultaDto> registrar(@Valid @RequestBody ConsultaDto dtoRequest) throws Exception {
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		ConsultaDto consulta = mapper.map(dtoRequest, ConsultaDto.class);
		ConsultaDto obj = servicio.validarCirculacion(consulta);
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}
}
