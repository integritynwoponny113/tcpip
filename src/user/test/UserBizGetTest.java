package user.test;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frame.Biz;
import user.UserBiz;
import vo.UserVO;

class UserBizGetTest {
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
	void testGetString() {
		UserVO k= new UserVO("id01", "asdf", "Park") ;
		UserVO result =null;
		try {
			result=biz.get(k.getId());
		} catch (Exception e) {
		System.out.println("get에러발생");
		}
		System.out.println(result);
	}

	@Test
	void testGet() {
		ArrayList<UserVO> result = null;
		try {
			result = biz.get();
		} catch (Exception e) {
			System.out.println("getAll에러발생");
		}
		for(UserVO a:result) {
			System.out.println(a);
		}
		
	}

}
