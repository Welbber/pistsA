package br.com.ufcg.ccc.psoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeCompleto;

	private String codigoAcesso;

	@OneToMany
	private Estabelecimento estabelecimento;

	public Funcionario() {
	}

	public Funcionario(Long id, String nomeCompleto, String codigoAcesso, Estabelecimento estabelecimento) {
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.codigoAcesso = codigoAcesso;
		this.estabelecimento = estabelecimento;
	}

	public Long getId() {
		return id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getCodigoAcesso() {
		return codigoAcesso;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

}