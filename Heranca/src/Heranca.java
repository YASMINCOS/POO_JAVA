
public class Heranca {

	public static void main(String[] args) {
		Pessoa p1= new Pessoa();
		Aluno p2= new Aluno();
		Professor p3=new Professor();
		Funcionario p4= new Funcionario();
		
		p1.setNome("Joao");
		p2.setNome("Maria");
		p3.setNome("Fabiana");
		p4.setNome("Aline");
		
		p1.setSexo("M");
		p3.setSexo("F");
		p2.setSexo("F");
		p4.setSexo("M");
		
		p2.setIdade(19);
		p2.setCurso("Engenharia");
		p3.setSalario(2000.5f);
		
		
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
}
