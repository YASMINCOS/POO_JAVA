
public class Aluno extends Pessoa {

	
	private String materia;
	private String curso;
	public void cancelarMatri() {
		System.out.println("Matricula sera cancela");
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}

