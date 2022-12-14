package message;

public class App implements Logger {

	@Override
	public void log(String pass) {
		String line = buildMessage(pass);
		System.out.println("App " + line);
		
	}

private String buildMessage(String pass) {
		
		return "Long Live " + pass + "!!!";
	}

	@Override
	public void error(String pass) {
		String line = buildMessage(pass);
		System.out.println("2App " + line);
			}

	}


