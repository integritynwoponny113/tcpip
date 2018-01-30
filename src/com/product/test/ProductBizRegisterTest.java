package com.product.test;

import org.junit.jupiter.api.Test;

import com.product.ProductBiz;
import com.vo.ProductVO;

class ProductBizRegisterTest {

	@Test
	void testRegisterProductVO() {
		ProductBiz pb = new ProductBiz();
		ProductVO pv = new ProductVO(100, "¹ÙÁö1", 10000);
		
		try {
			pb.register(pv);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
