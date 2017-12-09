package repositoryImpl;

import java.util.List;

import model.Usuario;

public interface UsuarioRepositoryImpl {
	
	public boolean adicionar(Usuario usuario);
	
	public Usuario remover(int indice);
	
	public List<Usuario> buscarTodos();
	
	public Usuario alterar(int indice,Usuario usuario);
	
	public Usuario buscarPorIndice(int indice);
}
