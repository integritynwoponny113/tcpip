package mvc;

public class UserDAO {

	
	
	public void userInsert(UserDTO user) {
		
		System.out.println("db�� user�Է�");
		System.out.println(user);
		System.out.println("�Է¿Ϸ�");
	}
	public void userDelete(String id) {
		
		System.out.println("db�� id����");
		System.out.println(id);
		System.out.println("�����Ϸ�");
	}
	public void userUpdate(UserDTO user) {
		
		System.out.println("db�� user����");
		System.out.println(user);
		System.out.println("�����Ϸ�");
	}
	
	
	
}
