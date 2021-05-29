package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IOperadorDao;
import com.example.demo.models.entity.OperadorEntity;

@Service
public class OperadorServiceImpl implements IOperadorService {

	@Autowired
	private IOperadorDao OperadorDao;

	@Override
	@Transactional(readOnly = true)
	public List<OperadorEntity> findAll() {
		return (List<OperadorEntity>) OperadorDao.findAll();
	}

	@Override
	@Transactional
	public OperadorEntity Save(OperadorEntity operadorentity) {
		return OperadorDao.save(operadorentity);
	}

	@Override
	@Transactional(readOnly = true)
	public OperadorEntity findById(Integer IdOperador) {
		return OperadorDao.findById(IdOperador).orElse(null);
	}

	@Override
	@Transactional
	public void Delete(Integer IdOperador) {
		OperadorDao.deleteById(IdOperador);

	}

}
