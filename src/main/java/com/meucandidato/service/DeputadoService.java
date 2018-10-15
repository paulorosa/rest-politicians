package com.meucandidato.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.meucandidato.entity.Deputado;

@Service
public class DeputadoService {
	private static final Logger log = LoggerFactory.getLogger(DeputadoService.class);
	private static final String URI = "https://dadosabertos.camara.leg.br/api/v2/deputados?nome=adalberto&itens=1&ordem=ASC&ordenarPor=nome";

	public Deputado get(String nome) {
		RestTemplate restTemplate = new RestTemplate();
		
//		HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<String> entity = new HttpEntity<String>("Hello World!", headers);
//        ResponseEntity<Object> personEntity = restTemplate.exchange(URI, HttpMethod.GET, entity, Object.class, 100);
		
		ResponseEntity<Object> personEntity = restTemplate.getForEntity(URI, Object.class);
        log.info(URI + nome);
        
        HttpHeaders httpHeaders = restTemplate.headForHeaders(URI, 100);
        log.info(httpHeaders.getContentType().toString());
        log.info(personEntity.getStatusCode().name());
        
        
		
		log.info(personEntity.getBody().toString());
		log.info(personEntity.getBody().getClass().getName().toString());

		//return personEntity.getBody();
		return null;
	}
}
