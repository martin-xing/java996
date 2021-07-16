package java996.dynamicproxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MethodInterceptorImpl implements MethodInterceptor {

	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("-----------����ִ��ǰ����ǿ�߼�------------------------------" + method);
		Object result = methodProxy.invokeSuper(object, args);
		System.out.println("-----------����ִ�к����ǿ�߼�------------------------------" + method);
		return result;
	}

}
