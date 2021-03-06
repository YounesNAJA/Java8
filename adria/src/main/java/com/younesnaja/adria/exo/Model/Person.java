package com.younesnaja.adria.exo.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Person implements Serializable {
	private static final long serialVersionUID = -6061836083473255990L;
	
	@Id
	private Integer id;
	
	@NotEmpty(message="Entez votre nom complet.")
	@Pattern(regexp="^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", message="Nom erroné.")
	private String completeName;
	
	@NotEmpty(message="Entez votre numéro de téléphone.")
	@Size(min=10,max=10, message="Le numéro de téléphone doit contenir 10 chiffres.")
	@Pattern(regexp="(^$|[0-9]{10})", message="Le numéro de téléphone est invalide.")
	private String phoneNum;
	
	@NotEmpty(message="Entez votre email.")
	@Pattern(regexp = "^\\S+@\\S+\\.com$", message = "Adresse email invalide.")
	private String email;

	public Person() {
	}

	public Person(Integer id, String completeName, String phoneNum, String email) {
		super();
		this.id = id;
		this.completeName = completeName;
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompleteName() {
		return completeName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return id + ", " + completeName + ", " + phoneNum + ", " + email;
	}
	
	
}
