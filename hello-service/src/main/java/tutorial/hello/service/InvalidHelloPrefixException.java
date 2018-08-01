package tutorial.hello.service;

public class InvalidHelloPrefixException extends RuntimeException {

	private String prefix;

	public InvalidHelloPrefixException(String prefix) {
		super(String.format("Invalid prefix '%s'", prefix));
		this.prefix = prefix;
	}

	public String getPrefix() {
		return prefix;
	}
}
