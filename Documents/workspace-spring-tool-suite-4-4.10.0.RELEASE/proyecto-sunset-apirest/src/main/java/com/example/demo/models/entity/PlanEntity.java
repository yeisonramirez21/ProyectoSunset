package com.example.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLANES")
public class PlanEntity implements Serializable {

	private static final long serialVersionUID = 4409715001983370226L;

	@Id
	@Column(name = "id_plan")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdPlan;

	@Column(name = "plan")
	private String Plan;

	@Column(name = "total_minutos")
	private String TotalMinutos;

	@Column(name = " total_datos")
	private String TotalDatos;

	public Integer getIdPlan() {
		return IdPlan;
	}

	public void setIdPlan(Integer idPlan) {
		IdPlan = idPlan;
	}

	public String getPlan() {
		return Plan;
	}

	public void setPlan(String plan) {
		Plan = plan;
	}

	public String getTotalMinutos() {
		return TotalMinutos;
	}

	public void setTotalMinutos(String totalMinutos) {
		TotalMinutos = totalMinutos;
	}

	public String getTotalDatos() {
		return TotalDatos;
	}

	public void setTotalDatos(String totalDatos) {
		TotalDatos = totalDatos;
	}

}
