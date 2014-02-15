package camel;

import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;

public class MyEndpoint extends DefaultEndpoint {

	@Override
	public Producer createProducer() throws Exception {
		return new MyProducer(this);
	}

	@Override
	public Consumer createConsumer(Processor processor) throws Exception {
		return null;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
