package java996.dynamicproxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MethodInterceptorImpl implements MethodInterceptor {

	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("-----------方法执行前的增强逻辑------------------------------" + method);
		Object result = methodProxy.invokeSuper(object, args);
		System.out.println("-----------方法执行后的增强逻辑------------------------------" + method);
		return result;
	}

}
