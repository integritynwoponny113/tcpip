package com.user.test;

import org.junit.jupiter.api.Test;

import com.user.UserBiz;
import com.vo.UserVO;

class UserBizModifyTest {

	@Test
	void testModifyUserVO() {
		UserBiz ub = new UserBiz();
		UserVO uv = new UserVO("id01", "123", "�ڼ���");
		try {
			ub.modify(uv);
			System.out.println("modify complete....!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
