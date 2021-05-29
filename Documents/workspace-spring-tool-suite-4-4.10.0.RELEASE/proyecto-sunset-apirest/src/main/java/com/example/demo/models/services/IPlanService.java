package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.PlanEntity;

public interface IPlanService {

	public List<PlanEntity> finAll();

	public PlanEntity Save(PlanEntity planentity);

	public PlanEntity findById(Integer IdPlan);

	public void Delete(Integer IdPlan);

}
