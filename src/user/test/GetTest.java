package user.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import javax.jws.soap.SOAPBinding.Use;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frame.Biz;
import user.UserBiz;
import vo.UserVO;

class GetTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Test Start");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Test End");
	}
	Biz biz;
	

	@Test
	final void testGetObject() {
		biz = new UserBiz();
		UserVO result = null;
		result = (UserVO) biz.get("id01");
		
		System.out.println(result);
		
	}

	@Test
	 final void testGet() {
		biz = new UserBiz();
		ArrayList<Object> list= null;
		list = biz.get();
		for(Object obj : list) {
		System.out.println(obj);
		}
		}

}
