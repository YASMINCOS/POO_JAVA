
public class Objeto {

	//estado-caracteristicas atuais
	//metodo- o que pode fazer
	//atributos-cor,
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
	public static void main(String[] args) {
		Caneta c1=new Caneta();
		c1.cor="azul";
		c1.tamanhoPonta=0.5f;
		c1.modelo="Bic";
		c1.qntdCarga=90;
		c1.tampada();
		
		c1.status();
		c1.rabiscar();
		
		Caneta c2= new Caneta();
		c1.modelo="Stabilo";
		c2.cor="vermelha";
		c2.tamanhoPonta=1.0f;
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
	}
}
