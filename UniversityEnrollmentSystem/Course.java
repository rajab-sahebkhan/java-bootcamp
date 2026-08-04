package UniversityEnrollmentSystem;

public class Course {

    private int courseCode;
    private String courseName;
    private int credits;

    public Course(int courseCode, String courseName, int credits){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    public int getCourseCode(){
        return courseCode;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getCredits(){
        return credits;
    }

    public String toString(){
        return "Course code: " + courseCode + "\nCourse name: " + courseName + "\nCredits: " + credits;
    }
}
