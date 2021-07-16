package java996.dynamicproxy.designpattern;

/**
 * ������
 * 
 * @author DELL
 *
 */
public class Proxy implements Subject {

	// Ҫ�����ĸ���
	private Subject subject = null;

	// Ĭ�ϱ�������
	public Proxy() {
		this.subject = new Proxy();
	}

	/**
	 * ͨ�����캯�����ݴ�����
	 * 
	 * @param subject
	 */
	public Proxy(Subject subject) {
		this.subject = subject;
	}

	/**
	 * ͨ�����캯�����ݴ�����
	 * 
	 * @param objects
	 */
	public Proxy(Object... objects) {

	}

	/**
	 * ʵ�ֽӿ��ж���ķ���
	 */
	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}

	/**
	 * Ԥ����
	 */
	private void before() {
		System.out.println("���д������ǰ�ô���");
	}

	/**
	 * ����
	 */
	private void after() {
		System.out.println("���д�����ú��ô���");
	}

}
