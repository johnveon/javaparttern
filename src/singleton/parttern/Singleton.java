package singleton.parttern;

public class Singleton {
	private Singleton(){}
	
	private static class SingletonFactory{
		public static final Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance(){
		return SingletonFactory.instance;
	}
}
