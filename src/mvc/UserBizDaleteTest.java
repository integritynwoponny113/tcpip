package mvc;

import org.junit.jupiter.api.Test;

class UserBizDaleteTest {

	@Test
	void testRemove() {
		UserBiz biz = new UserBiz();
		String str = "id03";
		try {
			biz.remove(str);
		} catch (Exception e) {
			System.out.println("입력오류");
			e.printStackTrace();
		}
		
		
	}

}
