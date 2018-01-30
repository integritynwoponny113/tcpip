package user.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frame.Biz;
import user.UserBiz;
import vo.UserVO;

class UserBizRemoveTest {
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
	void testRemoveString() {
		UserVO us = new UserVO("id01", "asd", "park");
	
		
			try {
				biz.remove(us.getId());
			} catch (Exception e) {
				System.out.println("wait");
			}
		
	}

}
