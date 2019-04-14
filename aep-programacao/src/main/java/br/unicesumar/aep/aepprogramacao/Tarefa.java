package br.unicesumar.aep.aepprogramacao;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;


@Entity
public class Tarefa {
	

	@Id
	@GeneratedValue
	
	private Integer id; 
	private String descricao; 
	private Date datacriacao; 
	private Status situacao; 
	private String responsavel; 
	private String horasestimadas;

	public enum Status {
		NAO_INICIADO,
		EM_PROGRESSO,
		TERMINADA,
		BLOQUEADA;
	}
	
	public Tarefa(Integer id, String descricao, Date datacriacao, Status situacao, String responsavel, String horasestimadas) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.datacriacao = datacriacao;
		this.situacao = situacao;
		this.responsavel = responsavel;
		this.horasestimadas = horasestimadas;
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

	public Date getDataCriacao() {
		return datacriacao;
	}

	public void setDataCriacao(Date datacriacao) {
		this.datacriacao = datacriacao;
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

	public String getHorasEstimadas() {
		return horasestimadas;
	}

	public void setHorasEstimadas(String horasestimadas) {
		this.horasestimadas = horasestimadas;
	}
	
	
}
