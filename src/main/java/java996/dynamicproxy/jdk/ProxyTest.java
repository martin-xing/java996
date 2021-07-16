package java996.dynamicproxy.jdk;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void contextTest() {
		// ʵ����Ŀ�����
		UserService userService = new UserServiceImpl();
		// ʵ����InvocationHandler
		MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
		// ���ɴ������
		UserService proxy = (UserService) invocationHandler.getProxy();
		// ���ô�����󷽷�
		proxy.add();
	}

}
