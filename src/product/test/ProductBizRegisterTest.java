package product.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frame.Biz;
import product.ProductBiz;
import vo.ProductVO;

class ProductBizRegisterTest {
	Biz<ProductVO,Integer> biz= new ProductBiz();
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
	void testRegisterProductVO() {
		ProductVO us = new ProductVO(1234, "asd",1000000);
		biz.register(us);
	}

}
