package br.unicesumar.aep.aepprogramacao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tarefa {
	

	@Id
	@GeneratedValue
	
	private int id; 
	private String descricao; 
	private String dataCriacao; 
	private Status situacao; 
	private String responsavel; 
	private float horasEstimadas;

	public enum Status {
		NAO_INICIADO,
		EM_PROGRESSO,
		TERMINADA,
		BLOQUEADA;
	}
	
	public Tarefa() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Status getSituacao() {
		return situacao;
	}

	public void setSituacao(Status situacao) {
		this.situacao = situacao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public float getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(float horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	
}
