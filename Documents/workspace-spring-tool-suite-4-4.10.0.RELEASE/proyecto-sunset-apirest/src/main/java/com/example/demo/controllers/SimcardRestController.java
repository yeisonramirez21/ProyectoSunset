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

import com.example.demo.models.entity.SimcardEntity;
import com.example.demo.models.services.ISimcardService;

@RestController
@RequestMapping("/Api")

public class SimcardRestController {

	@Autowired
	private ISimcardService SimcardService;

	@GetMapping("/Simcard")
	public List<SimcardEntity> index() {
		return SimcardService.finAll();

	}

	@GetMapping("/Simcard/{IdSimcard}")
	public SimcardEntity show(@PathVariable Integer IdSimcard) {
		return SimcardService.findById(IdSimcard);
	}

	@PostMapping("/Simcard")
	@ResponseStatus(HttpStatus.CREATED)
	public SimcardEntity create(@RequestBody SimcardEntity simcardentity) {
		return SimcardService.Save(simcardentity);
	}

	@PutMapping("/Simcard/{IdSimcard}")
	@ResponseStatus(HttpStatus.CREATED)
	public SimcardEntity update(@RequestBody SimcardEntity simcardentity, @PathVariable Integer IdSimcard) {
		SimcardEntity SimcardActual = SimcardService.findById(IdSimcard);
		SimcardActual.setIdOperador(simcardentity.getIdOperador());
		SimcardActual.setNumero(simcardentity.getNumero());
		SimcardActual.setEstado(simcardentity.getEstado());

		return SimcardService.Save(simcardentity);
	}

	@DeleteMapping("/Simcard/{IdSimcard}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer IdSimcard) {
		SimcardService.Delete(IdSimcard);
	}

}
