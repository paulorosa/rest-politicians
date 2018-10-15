package com.meucandidato.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meucandidato.entity.Deputado;
import com.meucandidato.service.DeputadoService;

@RestController
public class DeputadoController {

	@Autowired
	private DeputadoService deputadoService;

	@GetMapping("/deputado")
	@ResponseBody
	public ResponseEntity<Deputado> deputado(@RequestParam(name = "nome", required = false, defaultValue = "") String nome) {
		Deputado deputado = deputadoService.get(nome);
		if (deputado == null) {
			return new ResponseEntity<Deputado>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Deputado>(deputado, HttpStatus.OK);
	}
}
