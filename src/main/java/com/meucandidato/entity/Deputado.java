package com.meucandidato.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Deputado {

	private Integer id;
	private String picture;
	private String photo;
	private String siglaPartido;
	private String siglaUF;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getSiglaPartido() {
		return siglaPartido;
	}

	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}

	public String getSiglaUF() {
		return siglaUF;
	}

	public void setSiglaUF(String siglaUF) {
		this.siglaUF = siglaUF;
	}

	@Override
	public String toString() {
		return "Deputado [id=" + id + ", picture=" + picture + ", photo=" + photo + ", siglaPartido=" + siglaPartido
				+ ", siglaUF=" + siglaUF + "]";
	}

}
