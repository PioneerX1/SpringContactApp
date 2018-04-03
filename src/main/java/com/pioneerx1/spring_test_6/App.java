package com.pioneerx1.spring_test_6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    			new ClassPathXmlApplicationContext("com/pioneerx1/spring_test_6/beans/beans.xml");
    	
        //Person person = new Person();		this is replaced with....
    	Person person = (Person) context.getBean("person");
        person.speak();
        
        Address address = (Address) context.getBean("address");
        System.out.println(address);
        
        System.out.println(person);
        
        ((ClassPathXmlApplicationContext)context).close();
    }
}
