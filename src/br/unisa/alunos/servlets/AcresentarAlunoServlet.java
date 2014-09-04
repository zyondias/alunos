package br.unisa.alunos.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zyon.silva
 * Class para receber a requisicao via web para cadastra o aluno *
 */
@WebServlet("/addAluno")
public class AcresentarAlunoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		int idade = Integer.parseInt(request.getParameter("idade"));
		String ra = request.getParameter("ra");
		String curso = request.getParameter("curso");
		response.getWriter().print(ra);
		//enviado para lista
		//response.sendRedirect("sucesso.html");
	}

}
