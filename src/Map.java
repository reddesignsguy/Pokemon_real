import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Map {
	private final int WID_DIMENSION;
	private final int LN_DIMENSION;
	private int scale;
	private Tile[][] map;

// @param scale of each rect
//@param how many rectangles for wid and height
	public Map(int scale, int wid, int len) {
		this.WID_DIMENSION = wid;// how many rectangles in width
		this.LN_DIMENSION = len;// how many retcangles in height
		map = new Tile[this.LN_DIMENSION][this.WID_DIMENSION];
		this.scale = scale;
		fill();
	}

	public void fill() {
		// JUST A TESTER
		Tile t = new Tile();
		t.tree1();
		map[1][1] = t;
		// JUST A TESTER
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[r].length; c++) {
				// code IG
			}
		}
	}

	public void draw(Graphics g) {
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map[r].length; c++) {
				if (map[r][c] != null)
					map[r][c].draw(g, c * scale, r * scale, c);
			}
		}
	}
	// hey kidz this is the map class I created
	// make sure whenever you log on to eclipse, pull first to check for changes
}
