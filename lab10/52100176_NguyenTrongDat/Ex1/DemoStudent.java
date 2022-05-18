public class DemoStudent {
    public static void main(String[] args) {
        Student st = new Student("Nguyen Trong Dat", "TDTU", "male", 9);
        Student.StudentOperaration student = st.new StudentOperaration();
        System.out.println(student.print());
        System.out.println(student.type());
    }
}
