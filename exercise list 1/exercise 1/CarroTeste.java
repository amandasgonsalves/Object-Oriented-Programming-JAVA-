package l1ex01;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.modelo = "Fiesta";
		carro1.marca = "Ford";
		carro1.cor = "Vermelho";
		carro1.ano = 2008;
		carro1.renavam = 99999;
		carro1.chassi = "AHDY4739FF";
		carro1.placa = "NT-1G5K";
		
		System.out.println(carro1);

	}

}
