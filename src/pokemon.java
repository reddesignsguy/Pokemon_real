
public class pokemon { // all parameters requiring a string
	private String name;
	private String type;
	private int level;
	private int stage;
	private int hp;
	private int attack;
	private int spk_attack;
	private int defense;
	private int spk_defesne;
	private int speed;
	private int exp_Needed;

	public pokemon(String type) {
		this.type = type;
	}


	String getType() {
		
		return type;
	}

}
