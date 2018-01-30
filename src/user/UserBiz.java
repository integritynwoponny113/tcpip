package user;

import java.util.ArrayList;

import frame.Biz;
import vo.UserVO;


public class UserBiz extends Biz<UserVO,String > {

	public UserBiz(){
		dao = new UserDao() ;
	}
	
	@Override
	public void register(UserVO a) throws Exception {
		try {
			dao.insert(a);
		} catch (Exception e) {
			System.out.println("예외발생1!!!!!!");
			throw e;
		}
		
	}

	@Override
	public void modify(UserVO a) throws Exception {
		try {
			dao.update(a);
		} catch (Exception e) {
			System.out.println("예외발생2!!!!!!");
			throw e;
		}
		
	}

	@Override
	public void remove(String b) throws Exception {
		try {
			dao.delete(b);
		} catch (Exception e) {
			System.out.println("예외발생3!!!!!!"+e.getMessage());
			throw e;
		}
		
	}

	@Override
	public UserVO get(String b) throws Exception {
		UserVO user =null;
		try {
			user = dao.select(b);
		} catch (Exception e) {
			System.out.println("예외발생4!!!!!!");
			throw e;
		}
		return user;
	}

	@Override
	public ArrayList<UserVO> get() throws Exception {
		ArrayList<UserVO> al=null;
		try {
			al = dao.select();
		} catch (Exception e) {
			System.out.println("예외발생5!!!!!!");
			throw e;
		}
		
		return al;
	}

}
