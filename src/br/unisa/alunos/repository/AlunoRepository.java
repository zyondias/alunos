package br.unisa.alunos.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.unisa.alunos.repository.internal.MySQLFactory;
import br.unisa.alunos.vo.AlunoVo;

public class AlunoRepository {
	
	private static Connection con = MySQLFactory.getConection();
	
	
	public static boolean insert(AlunoVo alunoVo){
		//INSERT INTO alunos( `nome`, `idade`,`ra`,`curso`)
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO alunos(nome, idade,ra,curso) VALUES (?, ?, ?, ?) ");
			ps.setString(1, alunoVo.getNome());
			ps.setInt(2, alunoVo.getIdade());
			ps.setString(3, alunoVo.getRa());
			ps.setString(4, alunoVo.getCurso());
			
			return ps.execute();
			//return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public static List<AlunoVo> buscaAlunos(){
		List<AlunoVo>alunos = new ArrayList<AlunoVo>();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("SELECT * FROM alunos");
			ResultSet result = ps.executeQuery();
			while(result.next()){
				AlunoVo aluno = new AlunoVo();
				aluno.setNome(result.getString("nome"));
				aluno.setIdade(result.getInt("idade"));
				aluno.setRa(result.getString("ra"));
				aluno.setCurso(result.getString("curso"));
				alunos.add(aluno);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return alunos;
	}
}
