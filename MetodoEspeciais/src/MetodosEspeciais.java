
public class MetodosEspeciais {
//getters-metodo acessor-pega a informacao
	//getSaldo-consultar o saldo
	//e=nova Estante
	//t=e.getTocDoc()
	
//metodos modificadores= setters
	//modifica o qwue esta no objeto garantindo seguranca ao atributo
	//e= nova Estante
	//e.setToTDoc(doc)
	
//metodo construtor
	//
	public static void main(String[] args) {
		//Caneta c1= new Caneta();
		//chamando pelo metodo e pelo atributo
	//	c1.setModelo("Bic Cristal");
	//	c1.modelo="Bic Cristal ";
		//com set nao funciona,pois o atributos ponta e privado
	//	c1.setPonta(0.5f);
		Caneta c1= new Caneta("NIC","Amarelo",0.4f);
		c1.status();
		//System.out.println("Tento uma caneta " + c1.getModelo()+"de ponta: "+ c1.getPonta());
	}
	
}
