public class Student extends Person {
    private String id;
    private int score;

    public Student() {
        super();
        id = "";
        score = 0;
    }

    public Student(String name, int birthYear, String id, int score) {
        super(name, birthYear);
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + this.name + ", " + this.id + ", " + this.birthYear + ", " + this.score + "}";
    }
}
