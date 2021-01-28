
abstract class LigaindonesiaTop3Abstract {//abstraction

    abstract void setName();//Abstract method
    abstract String getName();//Abstract method
}

class Persija extends LigaindonesiaTop3Abstract{//Abstraction
    private String name;//Encapsulation
    Persija(){//Constructor
        this.name = "Persija";
    }
    public void setName() {//Setter-Encapsulation
        name = name;
    }
    public String getName() {//Getter-Encapsulation
        return name;
    }
}
class Persib extends LigaindonesiaTop3Abstract{
    private String name;//Encapsulation
    Persib(){//Constructor
        this.name = "Persib";
    }
    public void setName() {//Setter-Encapsulation
        name = name;
    }
    public String getName() {//Getter-Encapsulation
        return name;
    }
}
class Arema extends LigaindonesiaTop3Abstract{
    private String name;//Encapsulation
    Arema(){//Constructor
        this.name = "Arema F.C";
    }
    public void setName() {//Setter-Encapsulation
        name = name;
    }
    public String getName() {//Getter-Encapsulation
        return name;
    }
}
