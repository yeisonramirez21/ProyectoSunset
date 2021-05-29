package com.example.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DISPOSITIVOS")
public class DispositivoEntity implements Serializable {

	private static final long serialVersionUID = 950630190395943941L;

	@Id
	@Column(name = "id_dispositivo")
	private Integer IdDispositivo;

	@Column(name = "referencia")
	private String Referencia;

	@Column(name = "modelo")
	private String Modelo;

	@Column(name = "tipo_dispositivo")
	private String TipoDispositivo;

	@Column(name = "marca")
	private String Marca;

	public Integer getIdDispositivo() {
		return IdDispositivo;
	}

	public void setIdDispositivo(Integer idDispositivo) {
		IdDispositivo = idDispositivo;
	}

	public String getReferencia() {
		return Referencia;
	}

	public void setReferencia(String referencia) {
		Referencia = referencia;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getTipoDispositivo() {
		return TipoDispositivo;
	}

	public void setTipoDispositivo(String tipoDispositivo) {
		TipoDispositivo = tipoDispositivo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

}
