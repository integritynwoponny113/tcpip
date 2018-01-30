package frame;

import java.util.ArrayList;

public abstract class Biz<A,B> {
	protected Dao<A, B> dao;
	public void start() {
		System.out.println("start......");
	}
	public void end() {
		System.out.println("end......");
	}
	
	public abstract void register(A a) throws Exception;
	public abstract void modify(A a) throws Exception;
	public abstract void remove(B b) throws Exception;
	public abstract A get(B b) throws Exception;	
	public abstract ArrayList<A> get() throws Exception;
	
	
}
