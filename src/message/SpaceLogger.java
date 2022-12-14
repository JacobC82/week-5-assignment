package message;

public class SpaceLogger implements Logger {

	@Override
	public void log(String pass) {
		String spaceMsg = buildMessage(pass);
		System.out.println(spaceMsg);
	}

	private String buildMessage(String pass) {
		String spaceMsg = " ";
		
		for (int i = 0; i < pass.length(); i++) {
			spaceMsg += pass.charAt(i) + " ";
		}
	return spaceMsg.substring(0, spaceMsg.length() - 1);
	}
	

	@Override
	public void error(String pass) {
		System.out.println("Error: " + buildMessage(pass));
		System.out.println();
	}

}
