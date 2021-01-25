package br.senai.sp.jandira.model;

public class Cliente {
	
	private	String nome;
	private String cpf;
	private String telefone;
	private String cep;
	
/*Parte (Nome)*/	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
/*Parte (cpf)*/	
	public void setCpf(String cpf) {
		this.cpf= cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
/*Parte (Telefone)*/	
	public void setTelefone(String telefone) {
		this.telefone= telefone;
	}
	
	public String getTelfone() {
		return this.telefone;
	}
	
/*Parte (cep)*/
	public void setCep(String cep) {
		this.cep= cep;
	}
	
	public String getCep() {
		return this.cep;
	}
	
}
