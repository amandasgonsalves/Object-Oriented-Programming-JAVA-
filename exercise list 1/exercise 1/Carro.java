package l1ex01;

public class Carro {

	String modelo;
	String marca;
	String cor;
	int ano;
	int renavam;
	String chassi;
	String placa;
	
	public void ligar(){
		System.out.println("Ligando o " + this.modelo );
	}
	
	public void desligar() {
		System.out.println("Desligando o " + this.modelo);
	}
	
	public void acelerar() {
		System.out.println(this.modelo + " esta acelerando");
	}
	
	public void frear() {
		System.out.println(this.modelo + " esta freando");
	}
	
	//toString
	public String toString() {
		return "Carro [modelo=" + modelo + "\nmarca=" + marca + "\ncor=" + cor + "\nano=" + ano + "\nrenavam=" + renavam
				+ "\nchassi=" + chassi + "\nplaca=" + placa + "]";
	}
	
}
