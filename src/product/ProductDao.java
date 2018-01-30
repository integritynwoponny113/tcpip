package product;

import java.util.ArrayList;

import frame.Dao;
import vo.ProductVO;

public class ProductDao extends Dao<ProductVO, Integer> {

	@Override
	public void insert(ProductVO a) {
		start();
		System.out.println(a + " inserted....");
		end();
		
	}

	@Override
	public void delete(Integer b) {
		start();
		System.out.println(b + " deleted....");
		end();
		
	}

	@Override
	public void update(ProductVO a) {
		start();
		System.out.println(a + " updated....");
		end();
		
	}

	@Override
	public ProductVO select(Integer b) {
		start();
		System.out.println(b + "selected....");
		ProductVO a = new ProductVO(b, "asdf", 10000);
		end();
		return a;
	}

	@Override
	public ArrayList<ProductVO> select() {
		start();
		System.out.println("selectedAll....");
		ArrayList<ProductVO> al= new ArrayList<>();
		al.add(new ProductVO(123, "asdf", 10000));
		al.add(new ProductVO(14, "asdf1", 10000));
		al.add(new ProductVO(12, "asdf2", 10000));
		al.add(new ProductVO(123545, "asdf3", 10000));
		al.add(new ProductVO(1234, "asdf4", 10000));
		end();
		return al;
	}

}
