public class StudentClass {
    String name;
    int age;
    String rollNo;
    String house;

    public StudentClass(String name, int age, String rollNo, String house) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.house = house;
    }

    @Override
    public String toString() {
         return "Student Details: {name: " + name
                 + ", age: " + age
                 + ", roll number: " + rollNo
                 + ", house: " + house + " }";
    }

    public static void main(String[] args) {
        StudentClass stu = new StudentClass("Priyanshu",
                22, "001", "Tathagat");
        System.out.println(stu);
    }
}
