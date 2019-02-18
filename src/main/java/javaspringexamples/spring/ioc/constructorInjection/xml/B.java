package javaspringexamples.spring.ioc.constructorInjection.xml;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class B {
	private String name;

	public B(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
