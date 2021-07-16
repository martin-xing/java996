package java996.dynamicproxy.jdk;

public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		System.out.println("---------业务逻辑方法 add-----------");
	}

}
