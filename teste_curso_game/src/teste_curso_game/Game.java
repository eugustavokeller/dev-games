package teste_curso_game;

public class Game {
	public static void main(String[] args) {
		
		
		Player player = new Player();
		
		ElfInimigo elf = new ElfInimigo(10);
		
		elf.tomarDano();
		
		System.out.println(elf.getVida());
		
//		player.perderVida(2);
//		System.out.println(player.vida);
//		// Player tinha 10 ficou com 8...
//		
//		
//		player.ganharVida(4);
//		System.out.println("Vida antes da condicao: " + player.vida);
//		
//		if(player.vida > 10) {
//			player.vida = 10;
//		}
//		System.out.println(player.vida);
//		// Player tinha 8 agora fica com 12
//		
		
	}
}
