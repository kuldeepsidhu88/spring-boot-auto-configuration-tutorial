package tutorial.hello.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tutorial.hello.service.ConsoleHelloService;
import tutorial.hello.service.HelloService;

@Configuration
@ConditionalOnClass(HelloService.class)
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

	private HelloProperties properties;

	public HelloAutoConfiguration(HelloProperties helloProperties) {
		this.properties = helloProperties;
	}

	@Bean
	@ConditionalOnMissingBean
	@ConditionalOnProperty(prefix="hello", value="prefix")
	public HelloService helloService() {
		return new ConsoleHelloService(this.properties.getPrefix(), this.properties.getSuffix());
	}
	
}
