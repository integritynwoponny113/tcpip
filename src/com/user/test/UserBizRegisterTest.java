package com.user.test;

import org.junit.jupiter.api.Test;

import com.user.UserBiz;
import com.vo.UserVO;

class UserBizRegisterTest {

	@Test
	void testRegister() {
		UserBiz biz = new UserBiz();
		UserVO user = new UserVO("id01", "pwd01", "이말숙1");
		try {
			biz.register(user);
		} catch (Exception e) {
			System.out.println("입력오류");
			e.printStackTrace();
		}
		
		
	}

}
