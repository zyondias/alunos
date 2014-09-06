package br.unisa.alunos.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unisa.alunos.repository.AlunoRepository;
import br.unisa.alunos.vo.AlunoVo;
@WebServlet("/listarAlunos")
public class ListarAlunosServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.print("<html><head></head><body><h3>Lista de alunos</h3>");
		for(AlunoVo aluno : AlunoRepository.buscaAlunos()){
			out.print(aluno+"<br />");
		}
		out.print("<br /><a href=cadastro-aluno.html>Cadastra Aluno</a></body></html>");
	}

}
