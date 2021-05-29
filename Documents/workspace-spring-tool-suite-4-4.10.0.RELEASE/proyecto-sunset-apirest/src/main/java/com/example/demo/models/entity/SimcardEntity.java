package com.example.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SIMCARDS")
public class SimcardEntity implements Serializable {

	private static final long serialVersionUID = 3562240609286165788L;

	@Id
	@Column(name = "id_simcard")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdSimcard;
	
	@Column(name = "id_operador")
	private Integer IdOperador;
	
	@Column(name = "numero")
	private String Numero;
	
	@Column(name = "estado")
	private String Estado;

	public Integer getIdSimcard() {
		return IdSimcard;
	}

	public void setIdSimcard(Integer idSimcard) {
		IdSimcard = idSimcard;
	}

	public Integer getIdOperador() {
		return IdOperador;
	}

	public void setIdOperador(Integer idOperador) {
		IdOperador = idOperador;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	

}
