package mvc;

public class ProductBiz {

	private ProductDAO dao;
	
	public ProductBiz() {
		dao = new ProductDAO();
	}
	public void register(ProductDTO user) {
		System.out.println("데이터체크");
		System.out.println("아이템 입력");
		dao.productInsert(user);
		System.out.println("메일 전송");
	}
	public void modify(ProductDTO user) {
		System.out.println("데이터체크");
		dao.productUpdate(user);
	}
	public void remove(String name) {
		System.out.println("데이터체크");
		dao.productDelete(name);
	}
}
