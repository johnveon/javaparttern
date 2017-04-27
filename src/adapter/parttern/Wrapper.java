package adapter.parttern;

public class Wrapper implements Target {

	private Source source;
	
	public Wrapper(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
		
	}

	@Override
	public void method2() {
		System.out.println("Wrapper method2");
		
	}
	
}
