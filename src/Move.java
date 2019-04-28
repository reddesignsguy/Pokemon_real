
public class Move {
	private String name;
	private String type;
	private int power;
	private int accuracy;
	// if we have time to make effects later then make effects
	static final double[][] moveChart = new double[][]{
		{1.0,1.0,1.0,1.0,1.0},
		{1.0,0.5,0.5,1.0,1.0},
		{1.0,2.0,0.5,1.0,0.5},
		{1.0,1.0,2.0,0.5,0.5},
		{1.0,0.5,2.0,1.0,0.5}
	};

	//accuracy divided by 100
	public Move(String mov, String typ, int hpdamage, int hitmuch){
		name  = mov;
		type = typ;
		power = hpdamage;
		accuracy = hitmuch;

	}
	
	
	//checks if the move worked based on accuracy
	public boolean ifHit(){
		double acc = (double)accuracy/100;
		double randomCheck = Math.random();
		if (acc>randomCheck)
			return true;
		return false;
	}
	
	
	public String getName(){
		return name;
	}
	
	
	
	public String getType(){
		return type;
	}

	//returns the power a move has on other pokemon, maybe move to another class?
	public int totalPower(pokemon other){
		int oType = other.typeToNum();
		int thisType = this.typeToNum(); 

		double mult = moveChart[thisType][oType];
		double total = (double)this.power*mult;
		return (int)total;

	}
	
	
	
	public int typeToNum(){
		int typeNum;
		if (this.equals("normal")){
			typeNum = 0;
		}
		if (this.equals("fire")){
			typeNum = 1;
		}
		if (this.equals("water")){
			typeNum = 2;
		}
		if (this.equals("electric")){
			typeNum = 3;
		}
		if (this.equals("grass")){
			typeNum = 4;
		}
		else{
			return -1; // makes it easier to access the moveChart
		}
		return typeNum;

	}

}
// type order: normal, fire, water, electric, grass
