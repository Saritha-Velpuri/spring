package spring3;

public class Springclass3
{
        private Service s;

		public void setS(Service s) {
			this.s = s;
		}
		
		public void activateService() {
			s.service();
		}

}


