package br.senai.sp.jandira.model;

public class Conta {
	
	private String tipo;
	private double saldo;
	private String numero;
	private Cliente titular;
	private boolean ativa;
	private double chequeEspecial;
	
	/*Parte (Titular)*/
	public void setTitular(Cliente titular) {
		this.titular = titular;	
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	/* Parte (tipo)*/
	public void setTipo(String tipo) {
		
		if (tipo.contentEquals("Corrente") || tipo.contentEquals("Poupança")) {
			this.tipo= tipo;
		}
		else {
			System.out.println("Tipo Invalido");
		}
	}
	
	public String getTipo() {
		return this.tipo;
	}
 	
	
/*Parte (numero)*/	
	public void setnumero (String numero) {
		
		this.numero = numero;
	}
	
	public String getNumero() {
		return this.numero;
	}

	
/*Parte (Ativado e Desativado)*/
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	public boolean isAtiva() {
		return this.ativa;
	}
	

/*Parte (Cheque Especial)*/	
	public void setChequeEspecial(double ChequeEspecial) {
		
		this.chequeEspecial = ChequeEspecial;
	}
	
	public double getChequeEspecial() {
		return this.chequeEspecial;
	}
	
	public void depositar(double valorDeposito) {
		
		if (valorDeposito < 0) {
			System.out.println("Valor inválido!!!");
		} else {
			saldo += valorDeposito;
		}
		
	}
	
	public void mostrarSaldoDaConta() {
		System.out.println("Saldo: " + saldo);
		System.out.println("Saldo + Limite: " + (saldo + chequeEspecial));
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	
	
	public void sacar(double valorDoSaque) {
		
		if ((saldo + chequeEspecial) >= valorDoSaque) {
			saldo -= valorDoSaque;
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		
	}
	
	public void transferir() {
		
	}

}


