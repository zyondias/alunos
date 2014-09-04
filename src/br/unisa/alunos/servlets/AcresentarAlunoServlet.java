package br.unisa.alunos.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.unisa.alunos.vo.AlunoVo;

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
		
		
		response.getWriter().print(caputrarDadosAluno(request));
		//enviado para lista
		//response.sendRedirect("sucesso.html");
	}
	
	private static AlunoVo caputrarDadosAluno(HttpServletRequest request){
		AlunoVo aluno = new AlunoVo();
		aluno.setNome(request.getParameter("nome"));
		aluno.setIdade(Integer.parseInt(request.getParameter("idade")));
		aluno.setRa(request.getParameter("ra"));
		aluno.setCurso(request.getParameter("curso"));
		return aluno;
	}

}
