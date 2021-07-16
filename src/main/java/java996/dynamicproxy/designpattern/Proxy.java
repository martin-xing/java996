package java996.dynamicproxy.designpattern;

/**
 * 代理类
 * 
 * @author DELL
 *
 */
public class Proxy implements Subject {

	// 要代理哪个类
	private Subject subject = null;

	// 默认被代理者
	public Proxy() {
		this.subject = new Proxy();
	}

	/**
	 * 通过构造函数传递代理者
	 * 
	 * @param subject
	 */
	public Proxy(Subject subject) {
		this.subject = subject;
	}

	/**
	 * 通过构造函数传递代理者
	 * 
	 * @param objects
	 */
	public Proxy(Object... objects) {

	}

	/**
	 * 实现接口中定义的方法
	 */
	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}

	/**
	 * 预处理
	 */
	private void before() {
		System.out.println("进行代理调用前置处理。");
	}

	/**
	 * 后处理
	 */
	private void after() {
		System.out.println("进行代理调用后置处理。");
	}

}
