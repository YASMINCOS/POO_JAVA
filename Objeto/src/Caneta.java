
public class Caneta {

	String modelo;
	String cor;
	float tamanhoPonta;
	int qntdCarga;
	boolean tampada;
	boolean destampar;
	void status() {
		System.out.println("Modelo :"+ this.modelo);
		System.out.println("Uma caneta "+ this.cor);
		System.out.println("Ponta"+ this.tamanhoPonta);
		System.out.println("Carga"+ this.qntdCarga);
		System.out.println("esta tampada :" +this.tampada);
	}
	void rabiscar() {
		if(this.tampada==true) {
			System.out.println("nao posso rabiscar");
		}else {
			System.out.println("Pode rabiscar");
		}
			
		}
	void tampada() {
		this.tampada=true;
			
		}
	void destampar() {
		this.destampar=false;
		
	}

}
//instanciar-gera obeto a partir de uma classe
	//obj c1=new Caneta
	//c1.cor="azul"
	//c1.ponta=0.5;
	//c1.tampada=false
	//c1.rabiscar()
	
	//c2= new Caneta
	//c2.cor="vermelha"
	//c2.ponta=1.0;
	//c2.tampada=false
	//c2.tampar
