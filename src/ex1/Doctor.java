package ex1;

public class Doctor extends Person{
    @Override
    public String toString() {
        return "Good Morning/Afternoon Dr. " + getName();
    }
}
