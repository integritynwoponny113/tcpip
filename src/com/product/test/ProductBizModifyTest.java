package com.product.test;

import org.junit.jupiter.api.Test;

import com.product.ProductBiz;
import com.vo.ProductVO;

class ProductBizModifyTest {

	@Test
	void testModifyProductVO() {
		ProductBiz pb = new ProductBiz();
		ProductVO pv = new ProductVO(100, "¹ÙÁö", 12345);
		
		try {
			pb.modify(pv);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
