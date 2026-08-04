package UniversityEnrollmentSystem;

import java.util.ArrayList;
import java.util.HashMap;

public class University {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private HashMap<Integer, ArrayList<String>> enrollments = new HashMap<>();

    public void addStudent(int id, String name, int semester){
        Student student = new Student(id, name, semester);
        students.add(student);
    }

    public void addCourse(int courseCode, String courseName, int credits){
        Course course = new Course(courseCode, courseName, credits);
        courses.add(course);
    }

    public void enrollStudent(int studentId, int courseCode){
        if(students.isEmpty()){
            System.out.println("No students present. Please add students to continue.");
            return;
        }
        if(courses.isEmpty()){
            System.out.println("No courses available. Please add courses to continue.");
            return;
        }

        boolean found = false;

        for(Student student: students){
            if(studentId == student.getId()){
                for(Course course: courses){
                    if(courseCode == course.getCourseCode()) {
                        if(enrollments.containsKey(studentId)){
                            if(enrollments.get(studentId).contains(course.getCourseName())){
                                System.out.println("No duplicate enrollment allowed.");
                                return;
                            }
                            enrollments.get(studentId).add(course.getCourseName());
                        } else {
                            ArrayList<String> list = new ArrayList<>();
                            list.add(course.getCourseName());
                            enrollments.put(student.getId(),list);
                        }
                        System.out.println("Student enrolled successfully.");
                        return;
                    }
                }
                System.out.println("Student exists but course not found.");
                return;
            }
        }

        System.out.println("Student not found.");

    }

    public void removeEnrollment(int studentId, int courseCode){
        if(students.isEmpty()){
            System.out.println("No students present. Please add students to continue.");
            return;
        }
        if(courses.isEmpty()){
            System.out.println("No courses available. Please add courses to continue.");
            return;
        }
        if(enrollments.isEmpty()){
            System.out.println("None of the students have registered for any course.");
            return;
        }

        for(Student student : students){
            if(studentId == student.getId()){
                for(Course course : courses){
                    if(courseCode == course.getCourseCode()){
                        if(enrollments.containsKey(studentId)){
                            ArrayList<String> a = enrollments.get(studentId);

                            for(String b: a){
                                if(b.equalsIgnoreCase(course.getCourseName())){
                                    enrollments.get(studentId).remove(course.getCourseName());
                                    System.out.println("Enrollment removed successfully.");
                                    return;
                                }
                            }
                            System.out.println("Student didn't enroll for this course.");
                        } else{
                            System.out.println("No enrollment took place with this student Id.");
                        }
                        return;
                    }
                }
                System.out.println("Course not found");
                return;
            }
        }

        System.out.println("Student not found.");

    }

    public void displayStudentCourses(int studentId){
        if(students.isEmpty()){
            System.out.println("No students present. Please add students to continue.");
            return;
        }
        if(courses.isEmpty()){
            System.out.println("No courses available. Please add courses to continue.");
            return;
        }
        if(enrollments.isEmpty()){
            System.out.println("None of the students have registered for any course.");
            return;
        }

        for(Student student : students){
            if(studentId == student.getId()){
                if(enrollments.containsKey(studentId)){
                    System.out.println(student.getName());
                    System.out.println(enrollments.get(studentId));
                } else{
                    System.out.println(studentId + " has not registered for any courses.");
                }
                return;
            }
        }

        System.out.println("Student not found.");

    }

    public void displayStudents(){
        if(students.isEmpty()){
            System.out.println("No students present. Please add students to continue.");
            return;
        }

        int a=0;

        for(Student student : students){
            a++;
            System.out.println(a + ". " + student);
        }
    }

    public void displayCourses(){
        if(courses.isEmpty()){
            System.out.println("No courses available. Please add courses to continue.");
            return;
        }

        int a=0;

        for(Course course : courses){
            a++;
            System.out.println(a + ". " + course);
        }
    }

    public void displayStudentsWithMoreThan(int numOfCourses){
        if(students.isEmpty()){
            System.out.println("No students present. Please add students to continue.");
            return;
        }
        if(courses.isEmpty()){
            System.out.println("No courses available. Please add courses to continue.");
            return;
        }
        if(enrollments.isEmpty()){
            System.out.println("None of the students have registered for any course.");
            return;
        }

        int num;
        boolean found = false;

        for(Student student : students){
            if(enrollments.containsKey(student.getId())){

                ArrayList<String> a = enrollments.get(student.getId());

                if(a.size() > numOfCourses){
                    num=0;
                    found = true;
                    System.out.println(student.getName());

                    for(String b: a){
                        num++;
                        System.out.println(num + ": " + b);
                    }
                }
            }
        }

        if(!found){
            System.out.println("No student with " + numOfCourses + " courses found.");
        }

    }

}
