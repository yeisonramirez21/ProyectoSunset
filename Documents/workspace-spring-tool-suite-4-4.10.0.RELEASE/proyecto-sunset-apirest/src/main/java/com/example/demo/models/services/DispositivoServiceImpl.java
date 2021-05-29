package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IDispositivoDao;
import com.example.demo.models.entity.DispositivoEntity;

@Service
public class DispositivoServiceImpl implements IDispositivoService {

	@Autowired
	private IDispositivoDao DispositivoDao;

	@Override
	@Transactional(readOnly = true)
	public List<DispositivoEntity> finAll() {
		return (List<DispositivoEntity>) DispositivoDao.findAll();
	}

	@Override
	@Transactional
	public DispositivoEntity Save(DispositivoEntity dispositivoentity) {
		return DispositivoDao.save(dispositivoentity);
	}

	@Override
	@Transactional(readOnly = true)
	public DispositivoEntity findById(Integer IdDispositivo) {
		return DispositivoDao.findById(IdDispositivo).orElse(null);
	}

	@Override
	@Transactional
	public void Delete(Integer IdDispositivo) {
		DispositivoDao.deleteById(IdDispositivo);

	}

}
