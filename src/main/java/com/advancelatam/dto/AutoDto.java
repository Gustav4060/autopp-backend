/**
 * 
 */
package com.advancelatam.dto;

import javax.validation.constraints.Size;

/**
 * @author gustavoefrainparcosanchez
 *
 */

public class AutoDto {

	private Integer idAuto;
	@Size(max = 7, message = "{placa.size}")
	private String placa;
	@Size(max = 30, message = "{color.size}")
	private String color;
	@Size(max = 50, message = "{modelo.size}")
	private String modelo;
	@Size(max = 100, message = "{chasis.size}")
	private String chasis;

	public Integer getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(Integer idAuto) {
		this.idAuto = idAuto;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

}
