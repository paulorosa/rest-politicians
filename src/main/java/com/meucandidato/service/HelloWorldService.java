package com.meucandidato.service;

import org.springframework.stereotype.Service;

import com.meucandidato.entity.HelloWorld;

@Service
public class HelloWorldService {
	public HelloWorld get(String nome) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setName("Hello World, " + nome + "!");
		return helloWorld;
	}
}
