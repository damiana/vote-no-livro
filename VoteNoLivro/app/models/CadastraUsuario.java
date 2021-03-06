package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import play.db.ebean.Model;

@Entity
public class CadastraUsuario extends Model{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6973941212741229689L;
	
	@GeneratedValue
	private Long id;	
	
	private String nome;
	private String email;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
