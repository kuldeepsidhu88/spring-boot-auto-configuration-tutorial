package tutorial.hello.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

import tutorial.hello.service.ConsoleHelloService;
import tutorial.hello.service.HelloService;

@SpringBootApplication
public class HelloApp {

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(HelloApp.class)
				.listeners(new HelloApplicationListener())
				.run(args);
	}

//	@Bean
	public HelloService helloService() {
		return new ConsoleHelloService("BeanPrefix", "BeanSuffix");
	}

}
