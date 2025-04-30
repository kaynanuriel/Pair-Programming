package com.example.CadastroPessoa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PessoaTest {

    @InjectMocks
    CadastroPessoa cadastro;

    @Test
    void pessoasCadastradas_Sucesso(){
        CadastroPessoa cadastro = new CadastroPessoa();
        assertTrue(cadastro.cadastrarPessoas("João Silva", "18996040908", "Av. 9 de Julho"));
        assertNotNull(cadastro.cadastrarPessoas("Kaynan Uriel Castiel da Silva", null, "Rua dos bobos nº 0"));
    }

    @Test
    void pessoasCadastradas_telefoneExiste(){
        // Arrange
        CadastroPessoa cadastro = new CadastroPessoa();

        // Act
        cadastro.cadastrarPessoas("Pedro Restani", "19996040504", "Bairro das Antas");

        // Assert
        assertTrue(cadastro.cadastrarPessoas("Pedro Restani", "19996040503", "Avenida dos Porcos"));
        assertFalse(cadastro.telefoneExiste("19996090503"));
        assertNotNull(cadastro.buscarPessoaTelefone("19996040503"));
        assertNull(cadastro.buscarPessoaTelefone(null));
    }

    @Test
    void pessoasCadastradas_enderecoExiste(){
        CadastroPessoa cadastro = new CadastroPessoa();
        cadastro.cadastrarPessoas("Willianson Araujo", "19987715004", "Avenida UI");
        assertTrue(cadastro.cadastrarPessoas("Willianson Araujo", "19987715003", "Avenida UX"));
        assertFalse(cadastro.cadastrarPessoas("Willianson Araujo", "19987715003", "Avenida UX"));
        assertNotNull(cadastro.buscarPessoaEndereco("Avenida UX"));
        assertNull(cadastro.buscarPessoaEndereco(null));
    }

    @Test
    void pessoasCadastradas_camposNulos(){
        CadastroPessoa cadastro = new CadastroPessoa();
        assertFalse(cadastro.cadastrarPessoas(null, "19880432", "Alamedas de Tupi"));
        assertFalse(cadastro.cadastrarPessoas("Frankillin Pessoa Cardoso", null, "Alamedas de Tupi"));
        assertFalse(cadastro.telefoneExiste("19880431"));
    }

    @Test
    void pessoasCadastradas_camposVazios(){
        CadastroPessoa cadastro = new CadastroPessoa();
        assertFalse(cadastro.cadastrarPessoas("", "18996040908", "Av.maracana nº243"));
        assertFalse(cadastro.cadastrarPessoas("Bryan Souza e Silva", "", "Av.maracana nº243"));
        assertNull(cadastro.buscarPessoaTelefone(null));
    }

}
