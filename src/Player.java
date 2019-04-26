import java.util.*;

import javax.imageio.ImageIO;

import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import java.awt.Graphics;

public class Player {
	private List<pokemon> pokemon = new ArrayList<pokemon>();
	private int xCo;
	private int yCo;
	private int playerSize;
	private Rectangle rect;
	private Image image;

	public Player(int x, int y, int ps) {
		xCo = x;
		yCo = y;
		playerSize = ps;
		rect = new Rectangle(x, y, playerSize, playerSize);
		image = getImage("characterUp.png");
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

	public void move(String s) {
		if (s.equals("left")) {
			rect.translate(-playerSize, 0);
		}
		if (s.equals("right")) {
			rect.translate(playerSize, 0);
		}
		if (s.equals("up")) {
			rect.translate(0, -playerSize);
			image = getImage("characterUp.png");
		}
		if (s.equals("down")) {
			rect.translate(0, playerSize);
			image = getImage("characterDown.png");
		}
	}
	
	public void draw(Graphics g) {
		if(image != null) {
			g.drawImage(image, rect.x, rect.y, rect.width,rect.height, null);
		}
		
	}

}