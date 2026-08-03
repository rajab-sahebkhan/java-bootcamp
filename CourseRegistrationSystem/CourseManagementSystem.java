package CourseRegistrationSystem;

import java.util.ArrayList;

public class CourseManagementSystem {

    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(int courseId, String courseName, int credits, int availableSeats){
        Course course = new Course(courseId, courseName, credits, availableSeats);
        courses.add(course);
    }

    public void removeCourse(int courseId){
        if(courses.isEmpty()){
            System.out.println("No courses available.");
            return;
        }

        for(int i=0; i< courses.size();i++){

            Course course = courses.get(i);

            if(courseId == course.getCourseId()){
                courses.remove(i);
                System.out.println("Course removed.");
                return;
            }
        }

        System.out.println("Course not found.");
    }

    public void searchCourse(int courseId){

        if(courses.isEmpty()){
            System.out.println("No courses available.");
            return;
        }

        for(Course course : courses){
            if(courseId == course.getCourseId()){
                System.out.println("Found!");
                System.out.println(course);
                return;
            }
        }

        System.out.println("Course not found.");

    }

    public void registerStudent(int courseId){

        if(courses.isEmpty()){
            System.out.println("No courses available.");
            return;
        }

        for(Course course:courses){
            if(courseId == course.getCourseId()){
                if(course.getAvailableSeats() > 0) {
                    course.setAvailableSeats(course.getAvailableSeats() - 1);
                    System.out.println("Successfully registered for the course.");
                    return;
                } else{
                    System.out.println("Course is full.");
                    return;
                }
            }
        }

        System.out.println("Course not found.");

    }

    public void cancelRegistration(int courseId){
        if(courses.isEmpty()){
            System.out.println("No courses available.");
            return;
        }

        for(Course course:courses){
            if(courseId == course.getCourseId()){
                course.setAvailableSeats(course.getAvailableSeats() +1);
                System.out.println("Cancellation successful.");
                return;
            }
        }

        System.out.println("Course not found.");

    }

    public void displayCourses(){
        if(courses.isEmpty()){
            System.out.println("No courses available.");
            return;
        }

        for(Course course: courses){
            System.out.println(course);
        }
    }

    public void displayCoursesAboveCredits(int credits){
        if(courses.isEmpty()){
            System.out.println("No courses available.");
            return;
        }

        for(Course course: courses){
            if(course.getCredits() > credits) {
                System.out.println(course);
            }
        }
    }
}
