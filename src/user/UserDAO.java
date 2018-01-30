/**
 * 
 */
package user;

import java.util.ArrayList;

import frame.DAO;
import vo.UserVO;

/**
 * @author student
 *
 */
public class UserDAO implements DAO{

	@Override
	public void insert(Object obj) {
		UserVO user = (UserVO)obj;
		System.out.println(user+" inserted....");
		
	}

	@Override
	public void delete(Object obj) {
		UserVO asd = (UserVO) obj;
		String id = (String)asd.getId();
		System.out.println(id+" deleted....");
	}

	@Override
	public void update(Object obj) {
		UserVO user = (UserVO)obj;
		System.out.println(user+" updated....");
		
	}

	@Override
	public Object select(Object obj) {
		String id = (String)obj;
		System.out.println(id+"selected....");
		UserVO user = new UserVO(id, "10di", "¹Ú¼ö¹Î");
		return user;
	}

	@Override
	public ArrayList<Object> select() {
		ArrayList<Object> al = new ArrayList<>();
		System.out.println("selectedAll....");
		al.add(new UserVO("1", "123", "A"));
		al.add(new UserVO("2", "123", "B"));
		al.add(new UserVO("3", "123", "C"));
		al.add(new UserVO("4", "123", "D"));
		al.add(new UserVO("5", "123", "E"));
		
		
		
		return al;
	}

}













