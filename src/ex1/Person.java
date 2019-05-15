package ex1;

public class Person {
    private String name;

    public Person(){
        this.name="default name";
    }
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
