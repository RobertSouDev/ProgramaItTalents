public class Clients {
    public String getName() {
        return name;
    }

    public Clients(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" +
                "age: " + age ;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int age;
}
