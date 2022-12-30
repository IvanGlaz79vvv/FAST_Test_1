
public class Main {
    public static void main (String args[]){

        Person tom = new Person("Tom", 36);
        System.out.println(tom.toString());
        Auto zubilo = new Auto (1, "Audi");
        System.out.println(zubilo);

    }
}
record Person(String name, int age) {
    @Override
    public String toString() {
        return "Person:\n" +
                "name = " + name +
                ", age = " + age;
    }
}
record Auto (int id, String name) {
    @Override
    public String toString() {
        return "\nAuto:" +
                "id = " + id +
                ", \nname = " + name;
    }
}