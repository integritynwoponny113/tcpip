package user.test;

import frame.Biz;
import user.UserBiz;
import vo.UserVO;

public class RegisterTest {

	public static void main(String[] args) {
		
		
		Biz test1 = new UserBiz();
		UserVO user = new UserVO("asd", "123", "¹Ú¼ö¹Î");
		test1.register(user);
		test1.remove(user);
		test1.modify(user);
		test1.get(user);
		test1.get();
		
		
	}
}
