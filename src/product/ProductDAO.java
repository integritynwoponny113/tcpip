package product;

import java.util.ArrayList;

import frame.DAO;
import vo.ProductVO;

public class ProductDAO implements DAO {

	@Override
	public void insert(Object obj) {
		ProductVO produ = (ProductVO) obj;
		
		System.out.println(produ+" inserted....");
		
	}

	@Override
	public void delete(Object obj) {
		
		int a =(int)obj;
		System.out.println(a+" deleted....");
		
	}

	@Override
	public void update(Object obj) {
		ProductVO product = (ProductVO) obj;
		
		System.out.println(product+" updated....");
		
	}

	@Override
	public Object select(Object obj) {
		int a =(int) obj;
		
		System.out.println(a+" selected....");	
		ProductVO s1 = new ProductVO(a, "墨墨坷胶乔目", 2000.0);
		return s1;
	}

	@Override
	public ArrayList<Object> select() {
		ArrayList<Object> al = new ArrayList<>();
		System.out.println("selectedAll....");
		al.add(new ProductVO(1234, "力前1", 10000));
		al.add(new ProductVO(1235, "力前2", 11000));
		al.add(new ProductVO(1236, "力前3", 12000));
		al.add(new ProductVO(1237, "力前4", 13000));
		al.add(new ProductVO(1238, "力前5", 14000));
		
		
		return al;
	}

}
