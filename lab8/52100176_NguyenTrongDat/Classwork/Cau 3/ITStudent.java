public class ITStudent extends Student {
    private int sID;

    public ITStudent() {
        super();
        sID = 0;
    }

    public ITStudent(String sName, double gpa, int sID) {
        super(sName, gpa);
        this.sID = sID;
    }

    public int getSID() {
        return this.sID;
    }

    public void setSID(int sID) {
        this.sID = sID;
    }

    @Override
    public String getRank() {
        if (super.gpa <= 10 && super.gpa > 8) {
            return "A";
        } else if (super.gpa >= 5) {
            return "B";
        }
        return "C";
    }
}
