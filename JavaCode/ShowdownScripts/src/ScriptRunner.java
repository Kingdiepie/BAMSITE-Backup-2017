public class ScriptRunner {

	public static void main(String[] args) {
		DataSheet moves = new DataSheet("BAM Data - Moves.csv");
		DataSheet items = new DataSheet("BAM Data - Items.csv");
		DataSheet moveset = new DataSheet("BAM Data - Pokemon Movesets.csv");
		DataSheet pokemon = new DataSheet("BAM Data - Pokemon.csv");
		DataSheet ability = new DataSheet("BAM Data - Abilities.csv");
		//printDebug(moves);
	}
	
	static void printDebug(DataSheet d){
		for(int r = 0; r < d.getD().size();r++) {
			for(int c = 0; c < d.getD().get(r).size();c++) {
				System.out.printf("%-"+((c+1)*10+10)+"s", d.getD().get(r).get(c));
			}
			System.out.println("");
		}
	}

}