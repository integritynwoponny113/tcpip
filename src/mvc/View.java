package mvc;

public class View {
	public static void main(String[] args) {
		UserDTO user = new UserDTO("asd", "asdasd", "park");
		UserBiz biz = new UserBiz();
		biz.register(user);
		
		
	}

}
