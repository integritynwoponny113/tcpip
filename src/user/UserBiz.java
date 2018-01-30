package user;

import java.util.ArrayList;

import frame.Biz;

public class UserBiz extends Biz {
	
	public UserBiz() {
		dao = new UserDAO();
	}
	@Override
	public void register(Object obj) {
		start();
		dao.insert(obj);
		end();
	}

	@Override
	public void modify(Object obj) {
		start();
		dao.update(obj);
		end();
	}

	@Override
	public void remove(Object obj) {
		start();
		
		dao.delete(obj);
		end();
	}

	@Override
	public Object get(Object obj) {
		start();
		Object asd=dao.select(obj);
		end();
		return asd;
	}

	@Override
	public ArrayList<Object> get() {
		start();
		ArrayList<Object> asd=dao.select();
		for (Object x : asd ) {
			System.out.println(x);
		}
		end();
		return asd;
	}

}
