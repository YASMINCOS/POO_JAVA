
public class Caneta {

	public String modelo;
	public String cor;
	private float tamanhoPonta;
	protected int qntdCarga;
	private boolean tampada;
	protected boolean destampar;
	public void status() {
		System.out.println("Modelo :"+ this.modelo);
		System.out.println("Uma caneta "+ this.cor);
		System.out.println("Ponta"+ this.tamanhoPonta);
		System.out.println("Carga"+ this.qntdCarga);
		System.out.println("esta tampada :" +this.tampada);
	}
	public void rabiscar() {
		if(this.tampada==true) {
			System.out.println("nao posso rabiscar");
		}else {
			System.out.println("Pode rabiscar");
		}
			
		}
	public void tampada() {
		this.tampada=true;
			
		}
	public void destampar() {
		this.destampar=false;
		
	}

}