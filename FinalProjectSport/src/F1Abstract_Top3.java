abstract class F1Abstract_Top3 {//abstraction

	abstract void setName();//Abstract method
	abstract String getName();//Abstract method
}

class Liverpool2 extends F1Abstract_Top3{//Abstraction
	private String name;//Encapsulation
	Liverpool2(){//Constructor
		this.name = "Mercedes";
	}
	public void setName() {//Setter-Encapsulation
		name = name;
	}
	public String getName() {//Getter-Encapsulation
		return name;
	}
}
class ManU2 extends F1Abstract_Top3{
	private String name;//Encapsulation
	ManU2(){//Constructor
		this.name = "Red Bull";
	}
	public void setName() {//Setter-Encapsulation
		name = name;
	}
	public String getName() {//Getter-Encapsulation
		return name;
	}
}
class Leicester2 extends F1Abstract_Top3{
	private String name;//Encapsulation
	Leicester2(){//Constructor
		this.name = "McLarren";
	}
	public void setName() {//Setter-Encapsulation
		name = name;
	}
	public String getName() {//Getter-Encapsulation
		return name;
	}
}
