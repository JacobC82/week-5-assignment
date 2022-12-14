package message;

public class Messager {

	public static void main(String[] args) {
		Logger asteriskLogger = new AsteriskLogger();
		asteriskLogger.log("Hello");
		asteriskLogger.error("Error: Hi there");
		
		Logger spaceLogger= new SpaceLogger();
		spaceLogger.log("Hello");
		spaceLogger.error("Goodbye");
		
		Logger app = new App();
		app.log("Pepper");
		app.error("The Queen");
	}

}
