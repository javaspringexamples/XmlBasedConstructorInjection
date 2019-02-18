package javaspringexamples.spring.ioc.constructorInjection.xml;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class A {
	private B b;
	private C c;
	
	public A(B b, C c) {
		this.b = b;
		this.c = c;
	}

	public A(C c, B b) {
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return b.toString() + "-" + c.toString();
	}

}
