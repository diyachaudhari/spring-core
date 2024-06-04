package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Bean.AddressBean;
import com.Bean.BookBean;
import com.Bean.StudentBean;

public class App 
{
    public static void main( String[] args)
    {
//        StudentBean s1 = new StudentBean();
//        StudentBean s2 = new StudentBean();
//        
//        System.out.println(s1);
//        System.out.println(s2);
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(context);
        
//        StudentBean s1 = context.getBean("studentBean",StudentBean.class);
//		StudentBean s2 = context.getBean("studentBean",StudentBean.class);
//     
//		System.out.println(s1);
//		System.out.println(s2);
		
		AddressBean a1 = context.getBean("AddressBean",AddressBean.class);
		AddressBean a2 = context.getBean("AddressBean",AddressBean.class);
		
		System.out.println(a1);
		System.out.println(a2);
		
		BookBean b1 = context.getBean("BookBean",BookBean.class);
		BookBean b2 = context.getBean("BookBean",BookBean.class);
		
		System.out.println(b1);
		System.out.println(b2);
		
		
    }
}
