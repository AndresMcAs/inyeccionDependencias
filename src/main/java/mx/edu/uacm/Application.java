package mx.edu.uacm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Application {
  
	public static void main(String []args) {
	
	
	  	 /* sin uso de spring*/
		//Ninja ninja = new Ninja();
		
		// inyeccion de dependencia
		//agragacion
	   // ninja.setArma(new Chacos());
	    
	//    ninja.setMision("pasar nivel uno");
	
	ApplicationContext contenedor = new ClassPathXmlApplicationContext("/context.xml");
	contenedor.getBean("ninja"); 
	}
}
