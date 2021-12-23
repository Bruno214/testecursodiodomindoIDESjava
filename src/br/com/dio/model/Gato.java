package br.com.dio.model;

import java.util.Objects;

public class Gato {
	private String nome;
	private String pelo;
	private int idade;
	
	public Gato(String nome, String pelo, int idade) {
		this.nome = nome;
		this.pelo = pelo;
		this.idade = idade;
	}
	
	public Gato() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome, pelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return idade == other.idade && Objects.equals(nome, other.nome) && Objects.equals(pelo, other.pelo);
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", pelo=" + pelo + ", idade=" + idade + "]";
	}
	
	
	
	/*public Gato(String nome, String pelo, int idade) {
		this.nome = nome;
		this.pelo = pelo;
		this.idade = idade;
	}*/
	
}

