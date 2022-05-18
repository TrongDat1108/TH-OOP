public class Student extends Person{
    private String program;
    private int year;
    private double fee;
    public Student(String name ,String address,String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.address = address;
        this.fee = fee;
    }
    public String getProgram(){
        return this.program;
    }
    public void setProgram(String prog){
        this.program = prog;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getFee(){
        return this.fee;
    }
    public void setFree(double fee){
        this.fee = fee;
    }
    @Override
    public String toString(){
        return "Student[ Name = "+this.name+", Program = "+this.program+", Year = "+this.year+", Fee = "+this.fee+" ]";
    }
}
