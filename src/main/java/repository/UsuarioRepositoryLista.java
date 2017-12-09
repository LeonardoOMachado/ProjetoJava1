package repository;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;
import repositoryImpl.UsuarioRepositoryImpl;

public class UsuarioRepositoryLista implements UsuarioRepositoryImpl{
	
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
