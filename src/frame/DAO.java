package frame;

import java.util.ArrayList;

	public interface DAO {
	
	/*
	 * Insert Object to Oracle DB
	 * 
	 * **/
	
	
	//CRUD method define
	public void insert(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public Object select(Object obj);
	public ArrayList<Object> select();
	
}
