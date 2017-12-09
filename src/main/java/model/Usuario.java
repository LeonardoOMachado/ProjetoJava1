package model;

public class Usuario {	
	private Integer id=0;
	private String nome;
	private String senha;
	public Usuario(String nome, String senha) {		
		this.nome = nome;
		this.senha = senha;
	}
	
	
	
	public String getNome() {		
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


}
