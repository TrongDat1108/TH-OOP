import java.util.ArrayList;

public class Test {
    public ArrayList<Student> findStudent(ArrayList<Student> lstStu) {
        ArrayList<Student> rank = new ArrayList<Student>();
        for (Student student : lstStu) {
            if (student.getRank().equals("A") == true || student.getRank().equals("Passed") == true) {
                rank.add(student);
            }
        }
        return rank;
    }

    public static void main(String[] args) {
        ArrayList<Student> lstStu = new ArrayList<Student>();
        lstStu.add(new ITStudent("Nguyen Van A", 8.5, 1));
        lstStu.add(new ITStudent("Nguyen Van B", 3, 2));
        lstStu.add(new ITStudent("Nguyen Van C", 9.5, 3));
        lstStu.add(new ITStudent("Nguyen Van D", 4.5, 4));
        lstStu.add(new ITStudent("Nguyen Van E", 5.1, 5));
        lstStu.add(new MathStudent("Nguyen Van F", 4.5, "123"));
        lstStu.add(new MathStudent("Nguyen Van G", 3.5, "456"));
        lstStu.add(new MathStudent("Nguyen Van H", 7.5, "789"));
        lstStu.add(new MathStudent("Nguyen Van I", 6.5, "101"));
        ArrayList<Student> rank = new Test().findStudent(lstStu);
        for (Student student : rank) {
            System.out.println(student.getName() + " " + student.getGpa() + " " + student.getRank());
        }
    }
}
