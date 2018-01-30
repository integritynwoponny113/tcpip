package product.test;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frame.Biz;
import product.ProductBiz;
import vo.ProductVO;

class ProductBizGetTest {
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
	void testGetInteger() {
		ProductVO k= new ProductVO(1234, "asdf",100000000) ;
		ProductVO result =null;
		result=biz.get(k.getId());
		System.out.println(result);
	}

	@Test
	void testGet() {
		ArrayList<ProductVO> result = null;
		result = biz.get();
		for(ProductVO a:result) {
			System.out.println(a);
	}

}
}
