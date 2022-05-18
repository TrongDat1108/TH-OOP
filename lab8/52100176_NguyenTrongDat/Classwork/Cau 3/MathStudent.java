public class MathStudent extends Student {
    private String sID;

    public MathStudent() {
        super();
        sID = "";
    }

    public MathStudent(String sName, double gpa, String sID) {
        super(sName, gpa);
        this.sID = sID;
    }

    public String getSID() {
        return this.sID;
    }

    public void setSID(String sID) {
        this.sID = sID;
    }

    @Override
    public String getRank() {
        if (super.gpa < 5) {
            return "Failed";
        } else {
            return "Passed";
        }
    }
}
