package mvc;

public class ProductBiz {

	private ProductDAO dao;
	
	public ProductBiz() {
		dao = new ProductDAO();
	}
	public void register(ProductDTO user) {
		System.out.println("������üũ");
		System.out.println("������ �Է�");
		dao.productInsert(user);
		System.out.println("���� ����");
	}
	public void modify(ProductDTO user) {
		System.out.println("������üũ");
		dao.productUpdate(user);
	}
	public void remove(String name) {
		System.out.println("������üũ");
		dao.productDelete(name);
	}
}
