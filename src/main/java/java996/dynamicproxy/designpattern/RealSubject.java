package java996.dynamicproxy.designpattern;

/**
 * 真实主题类
 * 
 * @author DELL
 *
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		// TODO 业务逻辑处理
		System.out.println("正在进行业务逻辑处理。");
	}

}
