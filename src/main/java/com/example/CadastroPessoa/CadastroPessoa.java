package com.example.CadastroPessoa;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CadastroPessoa {

	private List<Pessoa> pessoasCadastradas;

	public CadastroPessoa(){
		this.pessoasCadastradas = new ArrayList<>();
	}

	public boolean cadastrarPessoas(String nome, String telefone, String endereco){
		if (nome == null || nome.isEmpty() || telefone == null || telefone.isEmpty()){
			return false;
		}
		if (telefoneExiste(telefone)){
			return false;
		}

		Pessoa novaPessoa = new Pessoa(nome, null, telefone, endereco, null);
		pessoasCadastradas.add(novaPessoa);
		return true;
	}

	
	public boolean telefoneExiste(String telefone){
		for(Pessoa pessoa : pessoasCadastradas){
			if(pessoa.getTelefone().equals(telefone)){
				return true;
			}
		}
		return false;
	}

	public Pessoa buscarPessoaTelefone(String telefone){
		for(Pessoa pessoa : pessoasCadastradas){
			if(pessoa.getTelefone().equals(telefone)){
				return pessoa;
			}
		}
		return null;
	}

	
	public Pessoa buscarPessoaEndereco(String endereco){
		for(Pessoa pessoa : pessoasCadastradas){
			if(pessoa.getEndereco().equals(endereco)){
				return pessoa;
			}
		}
		return null;
	}
	
}