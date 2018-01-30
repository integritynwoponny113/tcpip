package product;

import java.util.ArrayList;

import frame.Biz;


public class ProductBiz extends Biz{

	public ProductBiz() {
		dao = new ProductDAO();
	}
	
	@Override
	public void register(Object obj) {
		dao.insert(obj);
		
	}

	@Override
	public void modify(Object obj) {
		dao.update(obj);
		
	}

	@Override
	public void remove(Object obj) {
		dao.delete(obj);
		
	}

	@Override
	public Object get(Object obj) {
		Object k=dao.select(obj);
		return k;
	}

	@Override
	public ArrayList<Object> get() {
		ArrayList<Object> al =dao.select();
		return al;
	}

}
