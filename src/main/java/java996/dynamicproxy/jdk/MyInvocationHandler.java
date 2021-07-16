package java996.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

	/**
	 * 需要增强的对象
	 */
	private Object target;

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	/**
	 * 执行目标对象
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("-----------方法执行前的增强逻辑------------------------------");
		Object result = method.invoke(target, args);
		System.out.println("-----------方法执行后的增强逻辑------------------------------");

		return result;
	}

	public Object getProxy() {
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(),
				this);
	}

}
