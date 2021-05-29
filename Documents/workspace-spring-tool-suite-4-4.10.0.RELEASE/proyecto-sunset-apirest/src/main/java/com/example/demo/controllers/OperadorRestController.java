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

import com.example.demo.models.entity.OperadorEntity;
import com.example.demo.models.services.IOperadorService;

@RestController
@RequestMapping("/Api")
public class OperadorRestController {

	@Autowired
	private IOperadorService OperadorService;

	@GetMapping("/Operador")
	public List<OperadorEntity> index() {
		return OperadorService.findAll();
	}

	@GetMapping("/Operador/{IdOperador}")
	public OperadorEntity show(@PathVariable Integer IdOperador) {
		return OperadorService.findById(IdOperador);
	}

	@PostMapping("/Operador")
	@ResponseStatus(HttpStatus.CREATED)
	public OperadorEntity create(@RequestBody OperadorEntity operadorentity) {
		return OperadorService.Save(operadorentity);
	}

	@PutMapping("/Operador/{IdOperador}")
	@ResponseStatus(HttpStatus.CREATED)
	public OperadorEntity update(@RequestBody OperadorEntity operadorentity, @PathVariable Integer IdOperador) {
		OperadorEntity OperadorActual = OperadorService.findById(IdOperador);
		OperadorActual.setOperador(operadorentity.getOperador());
		OperadorActual.setBanda(operadorentity.getBanda());

		return OperadorService.Save(OperadorActual);
	}

	@DeleteMapping("/Operador/{IdOperador}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer IdOperador) {
		OperadorService.Delete(IdOperador);
	}

}
