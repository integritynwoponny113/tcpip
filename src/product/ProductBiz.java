package product;

import java.util.ArrayList;

import frame.Biz;
import vo.ProductVO;


public class ProductBiz extends Biz<ProductVO,Integer > {

	public ProductBiz(){
		dao = new ProductDao() ;
	}
	
	@Override
	public void register(ProductVO a) {
		dao.insert(a);
		
	}

	@Override
	public void modify(ProductVO a) {
		dao.update(a);
		
	}

	@Override
	public void remove(Integer b) {
		dao.delete(b);
		
	}

	@Override
	public ProductVO get(Integer b) {
		
		return (ProductVO) dao.select(b);
	}

	@Override
	public ArrayList<ProductVO> get() {
		ArrayList<ProductVO> al=null;
		al = dao.select();
		
		return al;
	}

}
