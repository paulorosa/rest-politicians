package com.meucandidato.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meucandidato.entity.HelloWorld;
import com.meucandidato.service.HelloWorldService;

@RestController
public class HelloWorldController {

	@Autowired
	private HelloWorldService helloWorldService;

	@GetMapping("/welcome")
	@ResponseBody
	public ResponseEntity<HelloWorld> deputado(
			@RequestParam(name = "nome", required = false, defaultValue = "") String nome) {
		HelloWorld helloWorld = helloWorldService.get(nome);
		return new ResponseEntity<HelloWorld>(helloWorld, HttpStatus.OK);
	}
}
