import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Map {
	private int pngScale = 32;
	private int pngMapSize = 2528;
	private final int WID_DIMENSION;
	private final int LN_DIMENSION;
	private int mapSize;
	private int scale;
	private int xCo = -scale * 79;
	private int yCo = -scale * 79;
	private Tile[][] map;
	private Image image;
	//DEFAULT TILE SIZE FOR THE PNG IS 32 PIXELS 
	// xCo and yCo may be used.. will delete if not needed - albino
	
//adironene
	//PhoebeTang132003
// @param scale of each rect
//@param how many rectangles for wid and height
	public Map(int scale, int wid, int len) {
		
		this.WID_DIMENSION = wid;// how many rectangles in width
		this.LN_DIMENSION = len;// how many retcangles in height
		map = new Tile[this.LN_DIMENSION][this.WID_DIMENSION];
		this.scale = scale;
		image = getImage("Pokemon Map FOSHO.png");
		mapSize = 2528 * scale / pngScale;
	}

	public void fill() {
		
	}

	public void draw(Graphics g, int xo, int yo) {
		if(image != null) {
			g.drawImage(image, xCo + xo, yCo + yo, mapSize,mapSize, null);
		}
	}
	
	protected Image getImage(String fn) {
		Image img = null;
		try {
			
			img = ImageIO.read(this.getClass().getResource(fn));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}
	// hey kidz this is the map class I created
	// make sure whenever you log on to eclipse, pull first to check for changes
}
