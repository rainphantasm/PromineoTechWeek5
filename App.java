/**
 * 
 * @author Khongmong Thao
 * Logger for Promineo Tech assignment
 *
 */

//Interface
interface Logger{
	public void log(String input);
	public void error(String input);
}


class AsteriskLogger implements Logger{

	/**
	 * This method takes an input and prints it with 3 trailing asterisks
	 * @param - String input - the string to print after modifications
	 */
	@Override
	public void log(String input) {
		System.out.println("***"+input+"***");
		
	}
	
	/**
	 * This method takes an input and prints 3 lines, the center line is modified to have Error: at the front, and surrounded by asterisks, including using the other 2 lines
	 * @param - String input - the string to print after modifications
	 */
	@Override
	public void error(String input) {
	String centerOutput = "***Error: " + input + "***";
	String asteriskCover = new String(new char[centerOutput.length()]).replace('\0',  '*');
	System.out.println(asteriskCover+"\n"+centerOutput+"\n"+asteriskCover);
	}
	
}

class SpacedLogger implements Logger{
	/**
	 * This method takes a string and prints it with spaces between each character
	 * @param - String input - the string to be spaced and printed
	 */
	@Override
	public void log(String input) {
		String centerOutput = "";
		String[] spacedInput = input.split("");
		for(String iterate: spacedInput) {
			centerOutput+= iterate + " ";
		}
		centerOutput.trim();
		System.out.println(centerOutput);

		
	}
	
	/**
	 * This method takes a string and prints it with "ERROR: " at the front, and spaces between each character
	 * @param - String input - the string to be spaced and printed with "ERROR: "at the front
	 */
	@Override
	public void error(String input) {
		String centerOutput = "";
		String[] spacedInput = input.split("");
		for(String iterate: spacedInput) {
			centerOutput+= iterate + " ";
		}
		centerOutput.trim();
		System.out.println("ERROR: "+centerOutput);

		
	}
	
}


public class App {
	//Main method
	public static void main(String[] args) {
		//Instantiate both classes
		AsteriskLogger myAsteriskLogger = new AsteriskLogger();
		SpacedLogger mySpacedLogger = new SpacedLogger();
		
		String myString = "This is my string!";
		//Use methods of classes
		myAsteriskLogger.log(myString);
		myAsteriskLogger.error(myString);
		mySpacedLogger.log(myString);
		mySpacedLogger.error(myString);

	}

}
