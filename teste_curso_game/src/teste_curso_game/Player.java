package teste_curso_game;

public class Player {
	
	int vida = 10;
	String nome = "Gustavo";
	
	public void perderVida(int v) {
		vida -= v;
	}
	
	public void ganharVida(int v) {
		vida += v;
	}
}
