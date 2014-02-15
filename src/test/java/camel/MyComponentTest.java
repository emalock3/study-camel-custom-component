package camel;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class MyComponentTest extends CamelTestSupport {
	@Produce(uri = "direct:start")
	protected ProducerTemplate template;

	@Test
	public void test() {
		template.sendBody("hoge");
	}
	
	protected RouteBuilder createRouteBuilder() {
		return new RouteBuilder() {
			public void configure() {
				from("direct:start")
					.to("mycomponent:hoge")
					.log("end");
			}
		};
	}

}
