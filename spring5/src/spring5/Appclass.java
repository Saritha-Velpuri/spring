package spring5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	public class Appclass 
	{
	    public static void main( String[] args )
	    {
	        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(StudentConf.class);
	        College s =con.getBean("collegeBean" , College.class);
	        s.test();
	        con.close();
	    }
	}


