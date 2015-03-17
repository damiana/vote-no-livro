package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import play.db.ebean.Model;

@Entity
public class VotacaoModel extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 365807594314577541L;

	@GeneratedValue
	private Long id;
	private CadastraLivro codigoLivro;
	private CadastraUsuario nomeUsuario;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CadastraLivro getCodigoLivro() {
		return codigoLivro;
	}
	public void setCodigoLivro(CadastraLivro codigoLivro) {
		this.codigoLivro = codigoLivro;
	}
	public CadastraUsuario getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(CadastraUsuario nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	
	
	
	
	
	
}
