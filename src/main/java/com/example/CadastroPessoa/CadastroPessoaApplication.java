package com.example.CadastroPessoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class CadastroPessoaApplication {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(CadastroPessoaApplication.class, args);

			System.out.println("Informe o seu Nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Informe o seu Gênero(M/F): ");
			String genero = sc.nextLine();

			System.out.println("Informe seu Telefone: ");
			String telefone = sc.nextLine();
			
			System.out.println("Informe o seu Endereço: ");
			String endereco = sc.nextLine();
			
			System.out.println("Informe a sua Idade: ");
			Integer idade = sc.nextInt();

			Pessoa pessoa = new Pessoa();
			pessoa.setNome(nome);
			pessoa.setGenero(genero);
			pessoa.setTelefone(telefone);
			pessoa.setEndereco(endereco);
			pessoa.setIdade(idade);

			System.out.println("Olá: " + nome);
			System.out.println("Seu Gênero é - " + genero);
			System.out.println("Seu Telefone é: " + telefone);
			System.out.println("Seu Endereço é: " + endereco);
			System.out.println("Sua Idade é: " + idade);
	
	}

}