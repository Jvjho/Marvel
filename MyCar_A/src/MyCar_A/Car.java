package MyCar_A;

public class Car {
	//Declaração de atributos
	private String marca;
	private boolean ligado;
	private int velocidade;
	private int marcha;

	//Declaração de construtores	

	public Car() {

	}
	public Car(String marca, boolean ligado, int velocidade, int marcha) {
		this.marca = marca;
		this.ligado = ligado;
		this.velocidade = velocidade;
		this.marcha = marcha;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	//metodos dos sistemas programados pelos alunos

	public void ligarcar() {

		if(this.ligado == true) {
			System.out.println("O carro esta ligado");

		}else {
			System.out.println("O carro esta desligado");

		}
	}


}
