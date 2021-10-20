/**
 * 
 */
package com.advancelatam.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author gustavoefrainparcosanchez
 *
 */
@Entity
public class Circula {
	@Id
	private Integer idCircula;
	@Column(name = "nombreDia", nullable = false)
	private String nombreDia;
	@Column(name = "placa0", nullable = false)
	private String placa0;
	@Column(name = "placa1", nullable = false)
	private String placa1;
	@Column(name = "placa2", nullable = false)
	private String placa2;
	@Column(name = "placa3", nullable = false)
	private String placa3;
	@Column(name = "placa4", nullable = false)
	private String placa4;
	@Column(name = "placa5", nullable = false)
	private String placa5;
	@Column(name = "placa6", nullable = false)
	private String placa6;
	@Column(name = "placa7", nullable = false)
	private String placa7;
	@Column(name = "placa8", nullable = false)
	private String placa8;
	@Column(name = "placa9", nullable = false)
	private String placa9;
	
	

	public Integer getIdCircula() {
		return idCircula;
	}

	public void setIdCircula(Integer idCircula) {
		this.idCircula = idCircula;
	}

	public String getNombreDia() {
		return nombreDia;
	}

	public void setNombreDia(String nombreDia) {
		this.nombreDia = nombreDia;
	}

	public String getPlaca0() {
		return placa0;
	}

	public void setPlaca0(String placa0) {
		this.placa0 = placa0;
	}

	public String getPlaca1() {
		return placa1;
	}

	public void setPlaca1(String placa1) {
		this.placa1 = placa1;
	}

	public String getPlaca2() {
		return placa2;
	}

	public void setPlaca2(String placa2) {
		this.placa2 = placa2;
	}

	public String getPlaca3() {
		return placa3;
	}

	public void setPlaca3(String placa3) {
		this.placa3 = placa3;
	}

	public String getPlaca4() {
		return placa4;
	}

	public void setPlaca4(String placa4) {
		this.placa4 = placa4;
	}

	public String getPlaca5() {
		return placa5;
	}

	public void setPlaca5(String placa5) {
		this.placa5 = placa5;
	}

	public String getPlaca6() {
		return placa6;
	}

	public void setPlaca6(String placa6) {
		this.placa6 = placa6;
	}

	public String getPlaca7() {
		return placa7;
	}

	public void setPlaca7(String placa7) {
		this.placa7 = placa7;
	}

	public String getPlaca8() {
		return placa8;
	}

	public void setPlaca8(String placa8) {
		this.placa8 = placa8;
	}

	public String getPlaca9() {
		return placa9;
	}

	public void setPlaca9(String placa9) {
		this.placa9 = placa9;
	}

}
