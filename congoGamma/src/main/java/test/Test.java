package test;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		//ICongoMetier metier = (ICongoMetier) context.getBean("metier");
		
		//metier.addEmploye(new Employe(),)

	}

}
