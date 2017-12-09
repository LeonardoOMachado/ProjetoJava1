package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import repository.UsuarioRepositoryLista;
import repositoryImpl.UsuarioRepositoryImpl;

/**
 * Servlet implementation class UsuarioController
 */

@WebServlet(urlPatterns = { "/UsuarioController", "/usuarios" })
public class UsuarioController extends HttpServlet {	

	UsuarioRepositoryImpl usuarioRepository = new UsuarioRepositoryLista();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsuarioController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("name");
		String password = request.getParameter("password");
		Usuario usuario = new Usuario(nome, password);
//		RequestDispatcher rd = null;
//		if (usuarioRepository.adicionar(usuario))
//			rd = request.getRequestDispatcher("index.html");
//		else
//			rd = request.getRequestDispatcher("tela-cadastro.html");
//		
//		rd.forward(request, response);
	}

}
