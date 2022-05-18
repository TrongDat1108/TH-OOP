import java.util.ArrayList;

public class PersonModel<T> {
    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj) {
        al.add(obj);
    }

    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        PersonModel<Student> sinhVien = new PersonModel<Student>();
        sinhVien.add(new Student("Nguyen Trong Dat", 2003, "52100176", 8));
        sinhVien.add(new Student("Nguyen Phuc Dat", 2002, "52007644", 7));
        sinhVien.display();

        PersonModel<Employee> nhanVien = new PersonModel<Employee>();
        nhanVien.add(new Employee("Nguyen Phuc Dat", 2002, "52007644", 7000000));
        nhanVien.add(new Employee("Nguyen Trong Dat", 2003, "52100176", 8000000));
        nhanVien.display();

        PersonModel<Person> conNguoi = new PersonModel<Person>();
        conNguoi.add(new Person("Nguyen Trong Dat", 2003));
        conNguoi.add(new Person("Nguyen Phuc Dat", 2002));
        conNguoi.display();
    }
}
