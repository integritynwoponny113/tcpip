package mvc;

import org.junit.jupiter.api.Test;

class UserBizGetTest {

	@Test
	void testGetString() {
		UserBiz biz = new UserBiz();
		String str = "id01";
		try {
			System.out.println(biz.get(str));
			
		} catch (Exception e) {
			System.out.println("입력오류");
			e.printStackTrace();
		}
		
		
	}

	@Test
	void testGet() {
		UserBiz biz = new UserBiz();
		try {
			biz.get();
		} catch (Exception e) {
			System.out.println("입력오류");
			e.printStackTrace();
		}
		
		
	}

}
