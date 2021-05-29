package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.OperadorEntity;

public interface IOperadorService {

	public List<OperadorEntity> findAll();

	public OperadorEntity Save(OperadorEntity operadorentity);

	public OperadorEntity findById(Integer IdOperador);

	public void Delete(Integer IdOperador);

}
