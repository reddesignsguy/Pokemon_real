import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tile {

	public Tile() {

	}

	public void tree1() {
		
	}

	protected Image getImage() {
		Image img = null;
		String fn = "Tiles.png";
		try {

			img = ImageIO.read(this.getClass().getResource(fn));

		} catch (IOException e) {

			e.printStackTrace();
		}
		return img;
	}

	public BufferedImage crop(BufferedImage original, int x, int y, int w, int h) {
		return original.getSubimage(x, y, w, h);
	}
}
