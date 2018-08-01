package tutorial.hello.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tutorial.hello.service.HelloService;

@Component
public class HelloCommandLineRunner implements CommandLineRunner{

	private HelloService helloService;
	
	public HelloCommandLineRunner(HelloService helloService) {
		this.helloService = helloService;
	}

	@Override
	public void run(String... args) throws Exception {
		this.helloService.sayHello("CommandLineRunner");
	}

}
