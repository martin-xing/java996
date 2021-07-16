package java996.dynamicproxy.cglib;

import org.junit.Test;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

public class EnhancerTest {

	@Test
	public void contextTest() {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\project\\classes");

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(EnhanceDemo.class);
		enhancer.setCallback(new MethodInterceptorImpl());

		EnhanceDemo proxy = (EnhanceDemo) enhancer.create();

		proxy.test();
//		System.out.println(proxy);
	}

}
