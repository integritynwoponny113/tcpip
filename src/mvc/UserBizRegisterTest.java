package mvc;

import org.junit.jupiter.api.Test;

class UserBizRegisterTest {

	@Test
	void testRegister() {
		UserBiz biz = new UserBiz();
		UserVO user = new UserVO("id03", "pwd03", "이말숙3");
		try {
			biz.register(user);
		} catch (Exception e) {
			System.out.println("입력오류");
			e.printStackTrace();
		}
		
		
	}

}
