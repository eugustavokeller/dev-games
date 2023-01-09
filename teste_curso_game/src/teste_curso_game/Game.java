package teste_curso_game;

import java.util.ArrayList;

public class Game {
	public static void main(String[] args) {
		
		
		Player player = new Player();
		ArrayList<Inimigo> inimigos = new ArrayList<Inimigo>();
		
		inimigos.add(new ElfInimigo(100));
		inimigos.add(new ElfInimigo(100));
		inimigos.add(new ElfInimigo(100));
		inimigos.add(new ElfInimigo(100));
		inimigos.add(new ElfInimigo(100));
		
		for(int i = 0; i < inimigos.size(); i++) {
			
			Inimigo inimigoLocal = inimigos.get(i);
			
			if(i == 1) {
				inimigoLocal.tomarDano();
				System.out.println(inimigoLocal.vida);
			} else {
				System.out.println(inimigoLocal.vida);
			}
		}
//		ElfInimigo elf = new ElfInimigo(10);
//		
//		elf.tomarDano();
//		
//		System.out.println(elf.getVida());
		
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
