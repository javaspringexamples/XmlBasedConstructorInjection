package javaspringexamples.spring.ioc.constructorInjection.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/javaspringexamples/spring/ioc/constructorInjection/xml/xmlConfiguration.xml");

		// Getting and printing objectA_BC
		A objectA = (A) applicationContext.getBean("objectA_BC");
		System.out.println(objectA);

		// Getting and printing objectA_BC
		objectA = (A) applicationContext.getBean("objectA_CB");
		System.out.println(objectA);

	}

}
