package org.javaFit.classes;

import java.time.LocalDate;

//classe mãe de Aluno, Funcionario e PersonalTrainer
public abstract class Pessoa {

	protected String nome;
    protected String cpf;
    protected LocalDate dataNascimento;
    protected String contato;
    protected String senha;
	
	public Pessoa(String nome, String cpf, LocalDate dataNascimento, String contato, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.contato = contato;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return String.format("""
				Nome: %s
				CPF: %s
				Data de Nascimento: %s
				Contato: %s
				""", nome, cpf, dataNascimento, contato);

	}

}
