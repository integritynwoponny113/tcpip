package mvc;

import org.junit.jupiter.api.Test;

class UserBizUpdateTest {

	@Test
	void testUpdate() {
		UserBiz biz = new UserBiz();
		UserVO user = new UserVO("id03", "pwd03", "이말숙4");
		try {
			biz.modify(user);
		} catch (Exception e) {
			System.out.println("입력오류");
			e.printStackTrace();
		}
		
		
	}

}
