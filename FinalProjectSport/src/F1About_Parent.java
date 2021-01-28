

public class F1About_Parent {
	String about;
	String runState;
	
	public String printAbout() {//inheritance
		 this.about="This is the Graphical User Interface of EPL.info."
		 		+ "\nWe will show you many information about Formula One (F1)"; 
		 return about;
	}
	
	String run() {//polymorphism
		System.out.println("This website is running!");
		return "This website is running!";
	}
	
	public String printContact() {//overriding
		return "Email : fikrip480@gmail.com";
	}
	
}
