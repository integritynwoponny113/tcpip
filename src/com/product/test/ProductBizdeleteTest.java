package com.product.test;

import org.junit.jupiter.api.Test;

import com.product.ProductBiz;

class ProductBizdeleteTest {

	@Test
	void testRemoveInteger() {
		ProductBiz pb = new ProductBiz();
		Integer num = 100;
		
		try {
			pb.remove(num);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
