package teste_curso_game;

public class Inimigo {
	
	public int vida = 100;
	public String inimigoTipo = "tipo1";
	public int ataqueDano = 10;
	
	public Inimigo(int vida) {
		this.vida = vida;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void tomarDano() {
		vida--;
	}
	

}
