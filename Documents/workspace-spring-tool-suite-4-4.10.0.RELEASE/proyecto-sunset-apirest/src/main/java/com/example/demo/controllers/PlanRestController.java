package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.PlanEntity;
import com.example.demo.models.services.IPlanService;

@RestController
@RequestMapping("/Api")
public class PlanRestController {

	@Autowired
	private IPlanService PlanService;

	@GetMapping("/Plan")
	public List<PlanEntity> index() {
		return PlanService.finAll();
	}

	@GetMapping("/Plan/{IdPlan}")
	public PlanEntity show(@PathVariable Integer IdPlan) {
		return PlanService.findById(IdPlan);
	}

	@PostMapping("/Plan")
	@ResponseStatus(HttpStatus.CREATED)
	public PlanEntity create(@RequestBody PlanEntity planentity) {
		return PlanService.Save(planentity);
	}

	@PutMapping("/Plan/{IdPlan}")
	@ResponseStatus(HttpStatus.CREATED)
	public PlanEntity update(@RequestBody PlanEntity planentity, @PathVariable Integer IdPlan) {
		PlanEntity PlanActual = PlanService.findById(IdPlan);
		PlanActual.setPlan(planentity.getPlan());
		PlanActual.setTotalMinutos(planentity.getTotalMinutos());
		PlanActual.setTotalDatos(planentity.getTotalDatos());

		return PlanService.Save(planentity);
	}

	@DeleteMapping("/Plan/{IdPlan}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer IdPlan) {
		PlanService.Delete(IdPlan);
	}
}
