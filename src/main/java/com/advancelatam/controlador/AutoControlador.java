/**
 * 
 */
package com.advancelatam.controlador;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advancelatam.dto.AutoDto;
import com.advancelatam.excepcion.ModeloNotFoundException;
import com.advancelatam.modelo.Auto;
import com.advancelatam.servicio.IAutoServicio;

/**
 * @author gustavoefrainparcosanchez
 *
 */

@RestController
@RequestMapping("/autos")
public class AutoControlador {
	@Autowired
	private IAutoServicio servicio;

	@Autowired
	private ModelMapper mapper;

	/**
	 * Obtiene la lista de autos
	 * @return -dto de autos
	 * @throws Exception
	 */
	@GetMapping
	public ResponseEntity<List<AutoDto>> listar() throws Exception {
		List<AutoDto> lista = servicio.listar().stream().map(p -> mapper.map(p, AutoDto.class))
				.collect(Collectors.toList());
		return new ResponseEntity<>(lista, HttpStatus.OK);
	}

	/**
	 * Lista por identificador de auto
	 * @param id identificador del auto
	 * @return Dto de auto
	 * @throws Exception
	 */
	@GetMapping("/{id}")
	public ResponseEntity<AutoDto> listarPorId(@PathVariable("id") Integer id) throws Exception {
		AutoDto dtoResponse;
		Auto obj = servicio.listarPorId(id); 

		if (obj == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		} else {
			dtoResponse = mapper.map(obj, AutoDto.class); // PacienteDTO
		}

		return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
	}

	/**
	 * Registra el auto
	 * @param dtoRequest dto del auto
	 * @return auto dto
	 * @throws Exception
	 */
	@PostMapping
	public ResponseEntity<AutoDto> registrar(@Valid @RequestBody AutoDto dtoRequest) throws Exception {
		Auto p = mapper.map(dtoRequest, Auto.class);
		Auto obj = servicio.registrar(p);
		AutoDto dtoResponse = mapper.map(obj, AutoDto.class);
		return new ResponseEntity<>(dtoResponse, HttpStatus.CREATED);
	}

	/**
	 * Modifica el auto
	 * @param dtoRequest deto de auto
	 * @return dto de auto modificado
	 * @throws Exception
	 */
	@PutMapping
	public ResponseEntity<AutoDto> modificar(@RequestBody AutoDto dtoRequest) throws Exception {
		Auto pac = servicio.listarPorId(dtoRequest.getIdAuto());

		if (pac == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + dtoRequest.getIdAuto());
		}

		Auto p = mapper.map(dtoRequest, Auto.class);

		Auto obj = servicio.modificar(p);

		AutoDto dtoResponse = mapper.map(obj, AutoDto.class);

		return new ResponseEntity<>(dtoResponse, HttpStatus.OK);
	}

	/**
	 * Elimina auto por id
	 * @param id identificador del auto
	 * @return retorna vacio
	 * @throws Exception
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception {
		Auto pac = servicio.listarPorId(id);

		if (pac == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}

		servicio.eliminar(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
