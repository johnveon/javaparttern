package adapter.parttern;

public class TestMian {
	public static void main(String[] args) {
		Adapter1 adapter1 = new Adapter1();
		adapter1.method1();
		adapter1.method2();
		
		Adapter2 adapter2 = new Adapter2();
		adapter2.method1();
		adapter2.method2();
		
		Source source = new Source();
		Wrapper adapter3 = new Wrapper(source);
		adapter3.method1();
		adapter3.method2();
	}
}
