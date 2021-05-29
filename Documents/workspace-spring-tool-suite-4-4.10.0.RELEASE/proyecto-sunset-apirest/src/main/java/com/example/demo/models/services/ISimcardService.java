package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.SimcardEntity;



public interface ISimcardService {
	
	public List<SimcardEntity> finAll();
	
	public SimcardEntity Save(SimcardEntity simcardentity);
	
	public SimcardEntity findById(Integer IdSimcard);
	
	public void Delete (Integer IdSimcard);
	

}
 