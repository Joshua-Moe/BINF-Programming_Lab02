import java.util.Random;


public class Quiz {
	public static String[] SHORT_NAMES = 
		{ "A","R", "N", "D", "C", "Q", "E", 
		"G",  "H", "I", "L", "K", "M", "F", 
		"P", "S", "T", "W", "Y", "V" };
		
	public static String[] FULL_NAMES = 
		{"alanine","arginine", "asparagine", 
		"aspartic acid", "cysteine",
		"glutamine",  "glutamic acid",
		"glycine" ,"histidine","isoleucine",
		"leucine",  "lysine", "methionine", 
		"phenylalanine", "proline", 
		"serine","threonine","tryptophan", 
		"tyrosine", "valine"};
	
	//This method will randomly pick a index.
	public int RandomPick() {
		int RANGE = SHORT_NAMES.length;
		Random rand = new Random();
		int PICK = rand.nextInt(RANGE);
		return PICK;
	}
	
	
	public static void main(String[] arg) {
		
		int SCORE = 0;
		boolean STOP = false;
		
		while(STOP != true)
		{
			Quiz x = new Quiz();
			int INDEX = x.RandomPick();
			
			System.out.println(FULL_NAMES[INDEX]);
			String ANSWER = SHORT_NAMES[INDEX]; 
			String aString = System.console().readLine().toUpperCase();
			String aChar = "" + aString.charAt(0);
			if (aChar.equals(ANSWER)) {
				SCORE = SCORE + 1;
				System.out.println("You are right! " + "Score: " + SCORE + ".");
				System.out.println();
				System.out.println();
				} 
			else {
				System.out.println("You are incorrect. " + "Answer should be " + SHORT_NAMES[INDEX] + ".");
				System.out.println("Final Score: " + SCORE);
				STOP = true;
				break;
				}
		}
	}
}
