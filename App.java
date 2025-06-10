package com.anshul.FirstProject;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anshul.beans.Address;
import com.anshul.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("Anshul.xml");
    	
    	Employee a=(Employee)ctx.getBean("e");
    	a.setName("Cheetah Khan");
    	System.out.println(a.getName());
    	System.out.println(a.getSalary());
    	System.out.println(a.getCname());
    	System.out.println(a);
    	Employee a2=(Employee)ctx.getBean("e");
    	System.out.println(a2);
    	
    	Address a1=ctx.getBean("ad",Address.class);
    	System.out.println(a1);
    }
}
