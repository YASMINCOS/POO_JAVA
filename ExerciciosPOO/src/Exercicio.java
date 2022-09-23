
public class Exercicio {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		
		Livro[] l = new Livro[3];
		
		p[0]=new Pessoa("Pedro",19,"M");
		p[1]=new Pessoa("Maria",21,"F");
		
		l[0]= new Livro("Aprendendo java","Jose silva",300,"Pedro");
		l[1]= new Livro("POO para Iniciantes","Paulo",500,"Maria");
		l[0]= new Livro("Java avancado","Jose silva",800,"Pedro");
		l[0].abrir();
		l[0].folhear(100);
		l[0].avancaPag();
		System.out.println(l[0].detalhes());
		
	}
}
