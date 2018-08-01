package tutorial.hello.starter;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

import tutorial.hello.service.InvalidHelloPrefixException;

public class InvalidHelloPrefixFailureAnalyzer extends AbstractFailureAnalyzer<InvalidHelloPrefixException> {

	@Override
	protected FailureAnalysis analyze(Throwable rootFailure, InvalidHelloPrefixException cause) {
		return new FailureAnalysis(
				String.format("The hello service could not be auto-cofigured properly : %s is invalid prefix",
						cause.getPrefix()),
				"A valid prefix must start with an upper-case character", cause);
	}

}
