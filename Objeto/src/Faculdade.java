
public class Faculdade {

	String curso;
	String professor;
	int sala;
	boolean aulaPratica;
	boolean aulaTeorica;
	void atualizar() {
		System.out.println("Curso:"+ this.curso);
		System.out.println("Professor :"+ this.professor);
		System.out.println("Numero da sala: "+this.sala);
		System.out.println("Aula pratica :"+this.aulaPratica);
		System.out.println("Aula teoria: "+this.aulaTeorica);
		
	}
	void faltar() {
		if(this.aulaTeorica==true) {
			System.out.println("Faltar");
		}else {
			System.out.println("Sem falta");
		}
			
		}
	void aulaPratica() {
		this.aulaPratica=false;
			
		}
	void aulaTeorica() {
		this.aulaTeorica=true;
		
	}
	}
