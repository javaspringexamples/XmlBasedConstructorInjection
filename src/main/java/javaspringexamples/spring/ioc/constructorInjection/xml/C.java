package javaspringexamples.spring.ioc.constructorInjection.xml;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class C {
	private String name;

	public C(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
