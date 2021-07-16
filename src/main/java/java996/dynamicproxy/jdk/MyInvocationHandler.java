package java996.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

	/**
	 * ��Ҫ��ǿ�Ķ���
	 */
	private Object target;

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	/**
	 * ִ��Ŀ�����
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("-----------����ִ��ǰ����ǿ�߼�------------------------------");
		Object result = method.invoke(target, args);
		System.out.println("-----------����ִ�к����ǿ�߼�------------------------------");

		return result;
	}

	public Object getProxy() {
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(),
				this);
	}

}
