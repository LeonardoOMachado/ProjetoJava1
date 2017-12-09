package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import repository.UsuarioRepository;

/**
 * Servlet implementation class UsuarioController
 */

@WebServlet(urlPatterns = {"/UsuarioController","/usuarios"})
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	UsuarioRepository usuarioRepository = new UsuarioRepository();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("name");
		String password = request.getParameter("password");
		Usuario usuario = new Usuario(nome,password);
		System.out.println(usuarioRepository.adicionar(usuario));
		PrintWriter print = response.getWriter();
		print.append("<table style='width:50%;text-align:center;'><thead><tr><th>Nome</th><th>Senha</th></tr></thead><tbody>");
		for(Usuario u : usuarioRepository.buscarTodos())
		print.append("<tr><td>"+u.getNome()+"</td><td>"+u.getSenha()+"</td></tr>");
		print.append("</tbody></table>");
	}

}
