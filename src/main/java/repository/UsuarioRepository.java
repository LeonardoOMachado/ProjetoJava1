package repository;

import java.util.List;
import java.util.ArrayList;

import model.Usuario;

public class UsuarioRepository {
	
	private List<Usuario> usuarios = new ArrayList<>();
	
	public boolean adicionar(Usuario usuario) {
		return usuarios.add(usuario);				
	}
	
	public Usuario remover(int indice) {
		return usuarios.remove(indice);
	}
	
	public List<Usuario> buscarTodos(){
		return usuarios;
	}
	
	public Usuario alterar(int indice,Usuario usuario) {
		return usuarios.set(indice, usuario);
	}
	
	public Usuario buscarPorIndice(int indice) {
		return usuarios.get(indice);
	}
}
