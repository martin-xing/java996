package java996.dynamicproxy.jdk;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void contextTest() {
		// 实例化目标对象
		UserService userService = new UserServiceImpl();
		// 实例化InvocationHandler
		MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
		// 生成代理对象
		UserService proxy = (UserService) invocationHandler.getProxy();
		// 调用代理对象方法
		proxy.add();
	}

}
