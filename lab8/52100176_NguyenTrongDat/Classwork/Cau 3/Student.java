public abstract class Student {
    protected String sName;
    protected double gpa;

    public Student() {
        sName = "";
        gpa = 0.0;
    }

    public Student(String sName, double gpa) {
        this.sName = sName;
        this.gpa = gpa;
    }

    public String getName() {
        return this.sName;
    }

    public void setName(String sName) {
        this.sName = sName;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public abstract String getRank();

}
