package sistematizacao;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String tipoSanguineo;
	private String alergias;
	private String problemasMedicos;
	private int contatoEmergencia;
	
	public Funcionario(String nome, int idade, String tipoSanguineo, String alergias, String problemasMedicos, int contatoEmergencia) {
		this.nome = nome;
		this.idade = idade;
		this.tipoSanguineo = tipoSanguineo;
		this.alergias = alergias;
		this.problemasMedicos = problemasMedicos;
		this.contatoEmergencia = contatoEmergencia;
	}

	public void exibirInformacoes( ) {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("TipoSanguineo: " + tipoSanguineo);
		System.out.println("Alergias: " + alergias);
		System.out.println("ProblemasMedicos: " + problemasMedicos);
		System.out.println("ContatoEmergencia: " + contatoEmergencia);
	}
	
	public static void main(String[] args) {
		List<Funcionario> lista = new ArrayList<>();
		lista.add(new FuncionarioAgente("Bernardo Braga Oliveira Viana", 20, "O+", "Nenhuma", "Nenhuma", 83100994));
		lista.add(new FuncionarioGerente("Maria Aparecida de Oliveira", 52, "O-", "Nenhuma", "Pressão alta", 85776391, "Gestão de pessoas", 11112222));
		lista.add(new FuncionarioSuporte("Giovani Braga Oliveira Viana", 21, "B-", "Poeira", "Diabetes", 86082576, "Assistente"));
		
		for (Funcionario funcionarios : lista) {
			funcionarios.exibirInformacoes();
			System.out.println("");
		}
	}
}

class FuncionarioAgente extends Funcionario {
	
	public FuncionarioAgente(String nome, int idade, String tipoSanguineo, String alergias, String problemasMedicos, int contatoEmergencia) {
		super(nome, idade, tipoSanguineo, alergias, problemasMedicos, contatoEmergencia);
	}
	
	public void exibirInformacoes() {
		System.out.println("Funcionário Operador: ");
		super.exibirInformacoes();		
	}
}

class FuncionarioGerente extends Funcionario {
	private String departamento;
	private int contatoDepartamento;
	
	public FuncionarioGerente(String nome, int idade, String tipoSanguineo, String alergias, String problemasMedicos, int contatoEmergencia, String departamento, int contatoDepartamento) {
		super(nome, idade, tipoSanguineo, alergias, problemasMedicos, contatoEmergencia);
		this.departamento = departamento;
		this.contatoDepartamento = contatoDepartamento;
	}
	
	public void exibirInformacoes() {
		System.out.println("Funcionário Gerente: ");
		super.exibirInformacoes();
		System.out.println("Departamento: " + departamento);
		System.out.println("ContatoDepartamento: " + contatoDepartamento);
	}
}

class FuncionarioSuporte extends Funcionario {
	private String funcao;
	
	public FuncionarioSuporte(String nome, int idade, String tipoSanguineo, String alergias, String problemasMedicos, int contatoEmergencia, String funcao) {
		super(nome, idade, tipoSanguineo, alergias, problemasMedicos, contatoEmergencia);
		this.funcao = funcao;
	}
	public void exibirInformacoes() {
		System.out.println("Funcionário Suporte: ");
		super.exibirInformacoes();
		System.out.println("Função: " + funcao);
	}
}
