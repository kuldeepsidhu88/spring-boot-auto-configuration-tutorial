package tutorial.hello.service;

public class ConsoleHelloService implements HelloService {

	private String prefix;
	private String suffix;

	
	public ConsoleHelloService() {
		this(null,null);
	}

	public ConsoleHelloService(String prefix, String suffix) {
		super();
		this.prefix = prefix != null ? prefix : "Hello";
		this.suffix = suffix != null ? suffix : "!";
		if (!Character.isUpperCase(prefix.charAt(0))) {
			throw new InvalidHelloPrefixException(this.prefix);
		}
	}

	public void sayHello(String name) {
		String msg = String.format("%s %s %s", this.prefix, name, this.suffix);
		System.out.println(msg);
	}

}
