public class Student{
    private String name, address, sex;
    private double score;
    public Student(){
        this.name = "";
        this.address = "";
        this.sex = "";
        this.score = 0.0;
    }

    public Student(String name, String address, String sex, double score){
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.score = score;
    }

    class StudentOperaration {
        public String print(){
            return "Student [" + name +"\", "+"\"" + address + "\", " + sex + "\", "+ "\"" + score+"\" ]";  
        }

        public String type(){
            if (score > 8){
                return "A";
            }
            else if (score >=5 && score <= 8){return "B";}
            return "C";
        }
    }
}