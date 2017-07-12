package operr.mas.api.integration.interfaces;

public interface AgentIntegration {
	/**
	 * Implement this for call to agent API
	 */
	<T> T pullData();
	
	/**
	 * Implement this to convert object pulled from API to csv file 
	 * and return full path of generated File
	 */
	String parseToCsv();
}
