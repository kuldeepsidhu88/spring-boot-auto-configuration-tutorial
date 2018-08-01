package tutorial.hello.app;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class HelloApplicationListener implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("==== Received " + event.getClass().getName());
	}

}
