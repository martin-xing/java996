package java996.dynamicproxy.designpattern;

public class Client {

	public static void main(String[] args) {
		Subject subject = new RealSubject();

		Proxy proxy = new Proxy(subject);

		proxy.request();
	}

}
