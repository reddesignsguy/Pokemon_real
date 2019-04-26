import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tile {
	private Image i;

	public Tile() {
		i = getImage();
	}

	public void tree1() {
		//havent figured out yet.
		i = crop((BufferedImage) i, 0, 0, 100, 100);
	}

	public void draw(Graphics g, int x, int y, int scale) {
		g.drawImage(i, x, y, scale, scale, null);
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
