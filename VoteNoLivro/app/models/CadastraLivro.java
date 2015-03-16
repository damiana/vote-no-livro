package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import play.db.ebean.Model;

@Entity
public class CadastraLivro extends Model{

	private static final long serialVersionUID = 8879207082755366786L;
	
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String codigo;
	
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
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}
