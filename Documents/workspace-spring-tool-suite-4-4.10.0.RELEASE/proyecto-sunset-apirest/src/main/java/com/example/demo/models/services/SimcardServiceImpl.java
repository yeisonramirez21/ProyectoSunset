package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.ISimcardDao;
import com.example.demo.models.entity.SimcardEntity;


@Service
public class SimcardServiceImpl implements ISimcardService{

	@Autowired
	private ISimcardDao SimcardDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<SimcardEntity> finAll() {
		return (List<SimcardEntity>) SimcardDao.findAll();
	}

	@Override
	@Transactional
	public SimcardEntity Save(SimcardEntity simcardentity) {
		return SimcardDao.save(simcardentity);
	}

	@Override
	@Transactional(readOnly = true)
	public SimcardEntity findById(Integer IdSimcard) {
		return SimcardDao.findById(IdSimcard).orElse(null);
	}

	@Override
	@Transactional
	public void Delete(Integer IdSimcard) {
		SimcardDao.deleteById(IdSimcard);
		
	}

}
