package course;

public class Course {
    static int maxCapacity = 10;
    String courseName;
    int enrolledStudents;
    String[] enrolledStudentsList;

    Course(String courseName){
        this.courseName = courseName;
        this.enrolledStudents = 0;
        this.enrolledStudentsList = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudentsList[enrolledStudents] = studentName;
        enrolledStudents++;
    }

    void unenrollStudent(String studentName){
        //considering that all student have unique name
        int i = 0;
        while(i < enrolledStudents){
            if(enrolledStudentsList[i] == studentName){
                while(i < enrolledStudentsList.length - 1){
                    enrolledStudentsList[i] = enrolledStudentsList[i + 1];
                    i++;
                }
            }
            i++; //This becomes false because i will be bigger than array length now, but if we have more than one student with same name then it will be different scenario
        }
        System.out.println("Student removed");
        enrolledStudents--;
    }

}
