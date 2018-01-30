package user.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frame.Biz;
import user.UserBiz;
import vo.UserVO;

class UserBizModifyTest {
	Biz<UserVO,String> biz= new UserBiz();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testModifyUserVO() {
		UserVO us = new UserVO("id01", "asdf", "park");
		try {
			biz.modify(us);
		} catch (Exception e) {
			System.out.println("id 중복입니다.");
		}
	}

}
