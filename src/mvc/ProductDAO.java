package mvc;

public class ProductDAO {


	public void productInsert(ProductDTO product) {

		System.out.println("db�� user�Է�");
		System.out.println(product);
		System.out.println("�Է¿Ϸ�");
	}

	public void productDelete(String name) {

		System.out.printf("db�� %s����\n", name);
		System.out.println(name);
		System.out.println("�����Ϸ�");
	}

	public void productUpdate(ProductDTO product) {

		System.out.println("db�� user����");
		System.out.println(product);
		System.out.println("�����Ϸ�");
	}

}
