package mvc;

public class UserDAO {

	
	
	public void userInsert(UserDTO user) {
		
		System.out.println("db에 user입력");
		System.out.println(user);
		System.out.println("입력완료");
	}
	public void userDelete(String id) {
		
		System.out.println("db에 id삭제");
		System.out.println(id);
		System.out.println("삭제완료");
	}
	public void userUpdate(UserDTO user) {
		
		System.out.println("db에 user수정");
		System.out.println(user);
		System.out.println("수정완료");
	}
	
	
	
}
