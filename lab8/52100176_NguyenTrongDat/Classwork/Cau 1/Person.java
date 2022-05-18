public class Person {
    protected String name;
    protected int birthYear;

    public Person() {
        name = "";
        birthYear = 0;
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" + this.name + ", " + this.birthYear + "}";
    }
}