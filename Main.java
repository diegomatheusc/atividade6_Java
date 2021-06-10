package atividade06;

public class Main {
	
	public static void main(String[] args) {

		computador pc = new pc ("Gamer Desktop");
	
		System.out.println(notbook.getTipoAparelho());
		notbook.carregar();
		System.out.println(pc.toString());
		System.out.println("Bateria: Hz" + pc.potenciahz());
		System.out.println(pc.getModeloProcessador());
		System.out.println("Potencia: " + pc.getPotencia());
		System.out.println("Tela: " + pc.monitor());
	
}

}
