package course;

public class Learning {
    public static void main(String[] args) {
        Course java = new Course("Java");

        System.out.println(Course.maxCapacity);
        Course.setMaxCapacity(5);
        System.out.println(Course.maxCapacity);

        java.enrollStudent("Priyanshu");
        java.enrollStudent("Raj");
        java.enrollStudent("Sandhya");
        java.enrollStudent("Ansh");
        java.enrollStudent("Sandhu");
        java.enrollStudent("Pragya");
        System.out.println(java.enrolledStudents);

        int i = 0;
        while(i < java.enrolledStudents){
            System.out.println(java.enrolledStudentsList[i]);
            i++;
        }

        java.unenrollStudent("Sandhya");
        System.out.println(java.enrolledStudents);
        i = 0;
        while(i < java.enrolledStudents){
            System.out.println(java.enrolledStudentsList[i]);
            i++;
        }

        java.unenrollStudent("Ansh");
        System.out.println(java.enrolledStudents);
        i = 0;
        while(i < java.enrolledStudents){
            System.out.println(java.enrolledStudentsList[i]);
            i++;
        }

        java.enrollStudent("Akshu");
        System.out.println(java.enrolledStudents);
        i = 0;
        while(i < java.enrolledStudents){
            System.out.println(java.enrolledStudentsList[i]);
            i++;
        }
    }
}
