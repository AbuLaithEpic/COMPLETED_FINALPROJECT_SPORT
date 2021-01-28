
public class uclPlayersList {
	
private String name, position, jersey, age;

    uclPlayersList(String name, String position, String jersey, String age){//initialized value
        this.name = name;
        this.position = position;
        this.jersey = jersey;
        this.age = age;
        
    }
    
    
    String getName(){ // Getter
        return name;
    }
    String getPosition(){
        return position;    
    }
    String getJersey(){
        return jersey;
    }
    
    String getAge() {
    	return age;
    }

}
