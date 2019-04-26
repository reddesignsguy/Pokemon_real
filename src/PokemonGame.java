import java.awt.Graphics;

public class PokemonGame {
//TBA map variable
	Player player;
	Map m;
	// for NOW change later
	int mapL = 20, mapW = 20;
	static int tileSize = 80;

	public PokemonGame() {
		player = new Player(0, 0, tileSize);
		m = new Map(tileSize, this.mapW, this.mapL);
	}

	public void keyHit(String s) {
		player.move(s);
	}

	public void draw(Graphics g) {
		player.draw(g);
	}
}