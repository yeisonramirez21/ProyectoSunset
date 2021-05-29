package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.PlanEntity;

public interface IPlanDao extends CrudRepository<PlanEntity, Integer> {

}
