package mvc;

public class UserBiz {

	private UserDAO dao;
	
	public UserBiz() {
		dao = new UserDAO();
	}
	public void register(UserDTO user) {
		System.out.println("������üũ");
		System.out.println("������ �Է�");
		dao.userInsert(user);
		System.out.println("���� ����");
	}
	public void modify(UserDTO user) {
		System.out.println("������üũ");
		dao.userUpdate(user);
	}
	public void remove(String id) {
		System.out.println("������üũ");
		dao.userDelete(id);
	}
}
