/**
 * 
 */

package com.advancelatam.dto;

import java.time.LocalDateTime;

/**
 * @author gustavoefrainparcosanchez
 *
 */
public class ConsultaDto {
	
	private String placa;
	private LocalDateTime fecha;
	private String mensaje;
	private String existeAuto;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getExisteAuto() {
		return existeAuto;
	}
	public void setExisteAuto(String existeAuto) {
		this.existeAuto = existeAuto;
	}

	
}
