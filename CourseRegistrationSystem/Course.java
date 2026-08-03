package CourseRegistrationSystem;

public class Course {

    private int courseId;
    private String courseName;
    private int credits;
    private int availableSeats;

    public Course(int courseId, String courseName, int credits, int availableSeats){
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.availableSeats = availableSeats;
    }

    public int getCourseId(){
        return courseId;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getCredits(){
        return credits;
    }

    public int getAvailableSeats(){
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats){
        this.availableSeats = availableSeats;
    }

    public String toString(){
        return "Course ID: " + courseId + "\nCourse Name: " + courseName + "\nCredits: " + credits + "\nAvailable seats: " + availableSeats;
    }

}
