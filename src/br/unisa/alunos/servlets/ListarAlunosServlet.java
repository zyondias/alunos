package br.unisa.alunos.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
	
	private PrintWriter out;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		out = response.getWriter();
		out.print("<html><head><title>Lista Alunos</title></head><body><h3>Lista de alunos</h3>");
		imprimirAlunosEmLista(AlunoRepository.buscaAlunos());
		out.print("<br /><a href=cadastro-aluno.html>Cadastra Aluno</a></body></html>");
	}
	
	private void imprimirAlunosEmLista(List<AlunoVo> alunos){
		out.print("<table><tr><th>Nome</th><th>Idade</th><th>Ra</th><th>Curso</th></tr>");
		for(AlunoVo aluno : alunos){
			out.print("<tr><td>"+aluno.getNome()+"</td>");
			out.print("<td>"+aluno.getIdade()+"</td>");
			out.print("<td>"+aluno.getRa()+"</td>");
			out.print("<td>"+aluno.getCurso()+"</td></tr>");
		}
		out.print("</table>");
	}

}
