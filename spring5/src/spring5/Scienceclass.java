package spring5;

import org.springframework.context.annotation.Primary;

	@Primary
	public class Scienceclass implements Teacherclass {
	     
		public void teach() {
			
			System.out.println("My name is captain");
			System.out.println("I'm Your Science Teacher");

		}

	}


