package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IPlanDao;
import com.example.demo.models.entity.PlanEntity;

@Service
public class PlanServiceImpl implements IPlanService {

	@Autowired
	private IPlanDao PlanDao;

	@Override
	@Transactional(readOnly = true)
	public List<PlanEntity> finAll() {
		return (List<PlanEntity>) PlanDao.findAll();
	}

	@Override
	@Transactional
	public PlanEntity Save(PlanEntity planentity) {
		return PlanDao.save(planentity);
	}

	@Override
	@Transactional(readOnly = true)
	public PlanEntity findById(Integer IdPlan) {
		return PlanDao.findById(IdPlan).orElse(null);
	}

	@Override
	@Transactional
	public void Delete(Integer IdPlan) {
		PlanDao.deleteById(IdPlan);

	}

}
