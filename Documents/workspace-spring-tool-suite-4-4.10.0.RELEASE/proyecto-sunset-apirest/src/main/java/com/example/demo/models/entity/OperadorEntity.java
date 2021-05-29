package com.example.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OPERADORES")
public class OperadorEntity implements Serializable {

	private static final long serialVersionUID = -1766952059183692788L;

	@Id
	@Column(name = "id_operador")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdOperador;
	@Column(name = "operador")
	private String Operador;
	@Column(name = "banda")
	private String Banda;

	public Integer getIdOperador() {
		return IdOperador;
	}

	public void setIdOperador(Integer idOperador) {
		IdOperador = idOperador;
	}

	public String getOperador() {
		return Operador;
	}

	public void setOperador(String operador) {
		Operador = operador;
	}

	public String getBanda() {
		return Banda;
	}

	public void setBanda(String banda) {
		Banda = banda;
	}

}
