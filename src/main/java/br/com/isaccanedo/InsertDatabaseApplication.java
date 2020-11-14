package br.com.isaccanedo;

import br.com.isaccanedo.domain.Pessoa;
import br.com.isaccanedo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.PostConstruct;

/**
 * @author Isac Canedo
 */

@SpringBootApplication
public class InsertDatabaseApplication {

	@Autowired
	private PessoaRepository pessoaRepository;

	public static void main(String[] args) {
		SpringApplication.run(InsertDatabaseApplication.class, args);
	}

	@PostConstruct
	public void init() {
		// Inserção de dados dos atributos nome e telefone da classe Pessoa
		pessoaRepository.save(new Pessoa("Isac", 12345678));
		pessoaRepository.save(new Pessoa("Canedo", 12345678));
		pessoaRepository.save(new Pessoa("Almeida", 12345678));
	}

}
