package com.country.test;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.country.CountryBIZ;
import com.vo.CountryVO;

class CountryBIZAllTest {

	@Test
	void testGetAll() {
		CountryBIZ biz = new CountryBIZ();
		ArrayList<CountryVO> list = null;

		try {
			list = biz.getAll();
			for (CountryVO c : list) {
				System.out.println(c);
				System.out.println(c.getGamevo());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}