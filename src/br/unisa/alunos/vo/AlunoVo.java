package br.unisa.alunos.vo;

/**
 * @author zyon.silva
 *Class para mapear propriedades de um aluno
 */
public class AlunoVo {
	private String nome;
	private int idade;
	private String ra;
	private String curso;
	
	
	/**
	 * @return {@link String} nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return {@link Integer} idade do aluno
	 */
	public int getIdade() {
		return idade;
	}
	/**
	 * @param idade
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 * @return {@link String} ra do aluno
	 */
	public String getRa() {
		return ra;
	}
	/**
	 * @param ra
	 */
	public void setRa(String ra) {
		this.ra = ra;
	}
	/**
	 * @return {@link String} nome do curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "AlunoVo [nome=" + nome + ", idade=" + idade + ", ra=" + ra
				+ ", curso=" + curso + "]";
	}
}
