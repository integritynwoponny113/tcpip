package com.country.test;

import org.junit.jupiter.api.Test;

import com.country.CountryBIZ;
import com.vo.CountryVO;

class CountryBIZSelectTest {

	@Test
	void testGetIDString() {

		CountryBIZ biz = new CountryBIZ();
		CountryVO country = null;
		try {
			country = biz.getID("ÇÑ±¹ South Korea");
			System.out.println(country);
			System.out.println(country.getGamevo());
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
