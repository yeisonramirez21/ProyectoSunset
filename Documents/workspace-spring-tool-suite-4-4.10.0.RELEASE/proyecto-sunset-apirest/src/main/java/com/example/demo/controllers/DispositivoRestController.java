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

import com.example.demo.models.entity.DispositivoEntity;
import com.example.demo.models.services.IDispositivoService;

@RestController
@RequestMapping("/Api")
public class DispositivoRestController {

	@Autowired
	private IDispositivoService DispositivoService;

	@GetMapping("/Dispositivo")
	public List<DispositivoEntity> index() {
		return DispositivoService.finAll();
	}

	@GetMapping("/Dispositivo/{IdDispositivo}")
	public DispositivoEntity show(@PathVariable Integer IdDispositivo) {
		return DispositivoService.findById(IdDispositivo);
	}

	@PostMapping("/Dispositivo")
	@ResponseStatus(HttpStatus.CREATED)
	public DispositivoEntity create(@RequestBody DispositivoEntity dispositivoentity) {
		return DispositivoService.Save(dispositivoentity);
	}

	@PutMapping("/Dispositivo/{IdDispositivo}")
	@ResponseStatus(HttpStatus.CREATED)
	public DispositivoEntity update(@RequestBody DispositivoEntity dispositivoentity,
			@PathVariable Integer IdDispositivo) {
		DispositivoEntity DispositivoActual = DispositivoService.findById(IdDispositivo);
		DispositivoActual.setReferencia(dispositivoentity.getReferencia());
		DispositivoActual.setModelo(dispositivoentity.getModelo());
		DispositivoActual.setTipoDispositivo(dispositivoentity.getTipoDispositivo());
		DispositivoActual.setMarca(dispositivoentity.getMarca());

		return DispositivoService.Save(dispositivoentity);
	}

	@DeleteMapping("/Dispositivo/{IdDispositivo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer IdDispositivo) {
		DispositivoService.Delete(IdDispositivo);
	}
}
