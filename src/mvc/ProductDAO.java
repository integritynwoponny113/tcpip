package mvc;

public class ProductDAO {


	public void productInsert(ProductDTO product) {

		System.out.println("db에 user입력");
		System.out.println(product);
		System.out.println("입력완료");
	}

	public void productDelete(String name) {

		System.out.printf("db에 %s삭제\n", name);
		System.out.println(name);
		System.out.println("삭제완료");
	}

	public void productUpdate(ProductDTO product) {

		System.out.println("db에 user수정");
		System.out.println(product);
		System.out.println("수정완료");
	}

}
