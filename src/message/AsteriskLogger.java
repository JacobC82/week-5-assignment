package message;

public class AsteriskLogger implements Logger {
	
	@Override
	public void log(String pass) {
		
		String line = buildMessage(pass);
		System.out.println(line);
	}
	private String buildMessage(String pass) {
		
		return "***" + pass + "***";
	}
	@Override
	public void error(String pass) {
		String line = buildMessage(pass);
		String outer = "*".repeat(line.length());
		
		System.out.println(outer);
		System.out.println(line);
		System.out.println(outer);
			}

}
