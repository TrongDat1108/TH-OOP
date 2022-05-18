public class Employee extends Person {
    private String id;
    private int salary;

    public Employee() {
        super();
        id = "";
        salary = 0;
    }

    public Employee(String name, int birthYear, String id, int salary) {
        super(name, birthYear);
        this.id = id;
        this.salary = salary;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emplyee{" + this.name + ", " + this.id + ", " + this.birthYear + ", " + this.salary + "}";
    }
}
