import java.awt.Graphics;

public class PokemonGame {
//TBA map variable
	Player player;
	Map m;
	// for NOW change later
	int mapL = 20, mapW = 20;
	static int xOffset = 0;
	static int yOffset = 0;
	static int tileSize = 40;

	public PokemonGame() {
		player = new Player(16*tileSize, 8*tileSize, tileSize);
		m = new Map(tileSize, this.mapW, this.mapL);
	}

	public void keyHit(String s) {
		player.move(s);
		cameraFocusOnPlayer(s);
		
	}

	public void cameraFocusOnPlayer(String s) {
		if (s.equals("left")) {
			xOffset+= tileSize;
		}
		if (s.equals("right")) {
			xOffset-= tileSize;
		}
		if (s.equals("up")) {
			yOffset+= tileSize;
		}
		if (s.equals("down")) {
			yOffset-= tileSize;
		}
	}
	public void draw(Graphics g) {
		m.draw(g, xOffset, yOffset);
		player.draw(g, xOffset, yOffset);
	}
}