/**
 * 
 */
package com.advancelatam.servicio.impl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancelatam.dto.ConsultaDto;
import com.advancelatam.modelo.Auto;
import com.advancelatam.modelo.Circula;
import com.advancelatam.repositorio.IAutoRepo;
import com.advancelatam.repositorio.ICirculaRepo;
import com.advancelatam.repositorio.IGenericRepo;
import com.advancelatam.servicio.IAutoServicio;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Service
public class AutoServicioImpl extends CRUDImpl<Auto, Integer> implements IAutoServicio {

	@Autowired
	private IAutoRepo AutoRepo;

	@Autowired
	private ICirculaRepo circulaRepo;

	@Override
	protected IGenericRepo<Auto, Integer> getRepo() {
		return AutoRepo;
	}

	@Override
	public ConsultaDto validarCirculacion(ConsultaDto consultaDto) throws Exception {

		Auto auto = AutoRepo.findByPlaca(consultaDto.getPlaca());

		if (Objects.isNull(auto)) {
			consultaDto.setExisteAuto("0");
			consultaDto.setMensaje("No se encuentra registrado");

		} else {
			consultaDto.setExisteAuto("1");
			char ultimoDigito = consultaDto.getPlaca().charAt(consultaDto.getPlaca().length() - 1);
			List<Circula> lstCirculacion = circulaRepo.buscarPorPlaca(ultimoDigito);
			lstCirculacion = lstCirculacion.stream()
					.filter(c -> c.getIdCircula().equals(consultaDto.getFecha().getDayOfWeek().getValue()))
					.collect(Collectors.toList());
			if (lstCirculacion.isEmpty()) {
				consultaDto.setMensaje("Puede circular");
			} else {
				consultaDto.setMensaje("No puede circular");
			}
		}
		// lstCirculacion.stream().map(c ->
		// c.getNombreDia()).collect(Collectors.toList());

		return consultaDto;
	}

}
