package com.product.test;

import org.junit.jupiter.api.Test;

import com.product.ProductBiz;

class ProductBizGetTest {

	@Test
	void testGetInteger() {
		ProductBiz pb = new ProductBiz();
		Integer num = 100;

		try {
			System.out.println(pb.get(num));
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Test
	void testGet() {
		ProductBiz pb = new ProductBiz();

		try {
			pb.get();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
