public class Pelajar extends Person{
    public String major;
    public Integer studentId;

    public Pelajar(Integer id, String name, String gender, String address,
                   int age, String major, Integer studentId) {
        super(id, name, gender, address, age);
        this.major = major;
        this.studentId = studentId;
    }

}
