
public class Visibilidade {

	//exemplo telefone
	//+publica-orelhao:classe atual e outras podem ter acesso
	//-privado-celular: apenas a class atual pode ter acesso
	//#protegida-telefone fixo-pessoas da casa:acesso atual e as subclasses
	public static void main(String[] args) {
		Caneta c1=new Caneta();
		c1.modelo="BIC cristal";
		c1.cor="Azul";
		//main esta dentro da classe que esta utilizando caneta
		c1.qntdCarga=40;
	//	c1.tampada=false;
		//declarei os ob privados e os metodos publicos
		c1.destampar();
		c1.status();
		c1.rabiscar();
	}
}
