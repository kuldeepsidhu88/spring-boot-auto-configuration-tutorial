package tutorial.hello.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hello")
public class HelloProperties {
	
	/**
	 * Prefix of the welcome message
	 */
	private String prefix;
	
	/**
	 * Suffix of the welcome message
	 */
	private String suffix = "!!!";
	
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}


}
