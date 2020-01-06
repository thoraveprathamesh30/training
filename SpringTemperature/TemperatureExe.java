package javaprogs;

import org.springframework.beans.factory.*;

import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

import javaprogs.Temperature;


public class TemperatureExe {
	
	public static void main(String[] args) throws Exception{
		

		Resource res =new ClassPathResource("Temperature.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Temperature temp = 
				(Temperature) 
				factory.getBean("Temperature");//java.lang.Object
			temp.toCelcius();
	}
	

}
