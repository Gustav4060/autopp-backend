/**
 * 
 */

package com.advancelatam.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Entity
public class Auto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAuto;

	@Column(name = "placa", nullable = false, length = 7)
	private String placa;

	@Column(name = "color", nullable = false)
	private String color;

	@Column(name = "modelo", nullable = false)
	private String modelo;

	@Column(name = "chasis", nullable = false)
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
