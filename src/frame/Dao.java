package frame;

import java.util.ArrayList;

public abstract class Dao<A,B> {
	/*
	 * Insert Object to Oracle DB
	 * 
	 * **/
	
	
	//CRUD method define
	public void start() {
		System.out.println("start............");
	}
	public void end() {
		System.out.println("end..............");
	}
	public abstract void insert(A a) throws Exception;
	public abstract void delete(B b) throws Exception;
	public abstract void update(A a) throws Exception;
	public abstract A select(B b) throws Exception;
	public abstract ArrayList<A> select() throws Exception;
}
