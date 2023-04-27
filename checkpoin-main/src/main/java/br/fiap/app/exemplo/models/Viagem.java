package br.fiap.app.exemplo.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Viagem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // auto increment
	private Long id;
	private Date data_decolagem;
	private Integer dias_estadia;
	private Integer quantidade_assento;
	private String modelo_nave;
	private String nome_primeirocomandante;
	private Integer matricula_primeirocomandante;
	private String nome_segundocomandante;
	private Integer matricula_segundocomandante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData_decolagem() {
		return data_decolagem;
	}

	public void setData_decolagem(Date data_decolagem) {
		this.data_decolagem = data_decolagem;
	}

	public Integer getDias_estadia() {
		return dias_estadia;
	}

	public void setDias_estadia(Integer dias_estadia) {
		this.dias_estadia = dias_estadia;
	}

	public Integer getQuantidade_assento() {
		return quantidade_assento;
	}

	public void setQuantidade_assento(Integer quantidade_assento) {
		this.quantidade_assento = quantidade_assento;
	}

	public String getModelo_nave() {
		return modelo_nave;
	}

	public void setModelo_nave(String modelo_nave) {
		this.modelo_nave = modelo_nave;
	}

	public String getNome_primeirocomandante() {
		return nome_primeirocomandante;
	}

	public void setNome_primeirocomandante(String nome_primeirocomandante) {
		this.nome_primeirocomandante = nome_primeirocomandante;
	}

	public Integer getMatricula_primeirocomandante() {
		return matricula_primeirocomandante;
	}

	public void setMatricula_primeirocomandante(Integer matricula_primeirocomandante) {
		this.matricula_primeirocomandante = matricula_primeirocomandante;
	}

	public String getNome_segundocomandante() {
		return nome_segundocomandante;
	}

	public void setNome_segundocomandante(String nome_segundocomandante) {
		this.nome_segundocomandante = nome_segundocomandante;
	}

	public Integer getMatricula_segundocomandante() {
		return matricula_segundocomandante;
	}

	public void setMatricula_segundocomandante(Integer matricula_segundocomandante) {
		this.matricula_segundocomandante = matricula_segundocomandante;
	}

}
