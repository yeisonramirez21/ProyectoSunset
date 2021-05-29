package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.DispositivoEntity;

public interface IDispositivoService {

	public List<DispositivoEntity> finAll();

	public DispositivoEntity Save(DispositivoEntity dispositivoentity);

	public DispositivoEntity findById(Integer IdDispositivo);

	public void Delete(Integer IdDispositivo);

}
