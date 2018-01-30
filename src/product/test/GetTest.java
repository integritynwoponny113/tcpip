package product.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frame.Biz;
import product.ProductBiz;
import user.UserBiz;
import vo.ProductVO;
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
		
		System.out.println("====Before====");
	
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("====After====");
	}
	Biz biz;

	@Test
	final void testRegister() {
		biz = new ProductBiz();
		ProductVO a = new ProductVO(1234, "asd", 20.0);
		biz.register(a);

	}

	@Test
	final void testModify() {
		biz = new ProductBiz();
		ProductVO a = new ProductVO(1234, "asd", 20.0);
		biz.modify(a);
		
	}

	@Test
	final void testRemove() {
		biz = new ProductBiz();
		ProductVO a = new ProductVO(1234, "asd", 20.0);
		biz.remove(a.getId());
		
	}

	
	@Test
	final void testGetObject() {
		biz = new ProductBiz();
		ProductVO result = null;
		result = (ProductVO) biz.get(123);
		
		System.out.println(result);
	}

	@Test
	final void testGet() {
		biz = new ProductBiz();
		ArrayList<Object> list= null;
		list = biz.get();
		for(Object obj : list) {
		System.out.println(obj);
		}
		}
	}

