package java996.dynamicproxy.designpattern;

/**
 * ��ʵ������
 * 
 * @author DELL
 *
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		// TODO ҵ���߼�����
		System.out.println("���ڽ���ҵ���߼�����");
	}

}
