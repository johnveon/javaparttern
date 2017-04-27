package singleton.parttern;

public class TestMain {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			Thread  thread = new Thread(new Runnable() {
				public void run() {
					Singleton singleton = Singleton.getInstance();
					System.out.println("thread name:("+Thread.currentThread().getName()+")singleton:("+singleton+")");
				}
			});
			thread.start();
			
		}
		
	}
}
