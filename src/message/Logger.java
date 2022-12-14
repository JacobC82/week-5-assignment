package message;
	
	/**
	 * This defines what you can do with the Logger interface.
	 * @author Jake
	 *
	 */


public interface Logger {
	/**
	 * Implementation Dependent
	 * @param pass
	 */
	
	void log(String pass);
	
	/**
	 * Implementation Dependent
	 * @param pass
	 */
	
	void error(String pass);
}
