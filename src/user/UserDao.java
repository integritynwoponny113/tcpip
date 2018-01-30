package user;

import java.util.ArrayList;

import frame.Dao;
import vo.UserVO;

public class UserDao extends Dao<UserVO, String> {

	@Override
	public void insert(UserVO a) throws Exception{
		start();
		if(a.getId().equals("asd")) {
			throw new Exception();
		}
		System.out.println(a + " inserted....");
		end();
		
	}

	@Override
	public void delete(String b) throws Exception {
		start();
		if(b.equals("id01")) {
			throw new Exception("에러코드 2");
		}
		System.out.println(b + " deleted....");
		end();
		
	}

	@Override
	public void update(UserVO a) throws Exception {
		start();
		if(a.getId().equals("id01")) {
			throw new Exception();
		}
		System.out.println(a + " updated....");
		end();
		
	}

	@Override
	public UserVO select(String b) {
		start();
		System.out.println(b + "selected....");
		UserVO a = new UserVO(b, "asdf", "parksoo");
		end();
		return a;
	}

	@Override
	public ArrayList<UserVO> select() {
		start();
		System.out.println("selectedAll....");
		ArrayList<UserVO> al= new ArrayList<>();
		al.add(new UserVO("id01", "asdf", "park"));
		al.add(new UserVO("id02", "asdf1", "park1"));
		al.add(new UserVO("id03", "asdf2", "park2"));
		al.add(new UserVO("id04", "asdf3", "park3"));
		al.add(new UserVO("id05", "asdf4", "park4"));
		end();
		return al;
	}

}
