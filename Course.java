import java.util.Arrays;
import java.util.Scanner;

public class Course {

    String courseId;
    String courseName;
    String instructor;
    String startDate;
    int lessons;
    int level;

    Course(String _courseId, String _courseName, String _instructor, String _startDate, int _lessons, int _level) {
        courseId = _courseId;
        courseName = _courseName;
        instructor = _instructor;
        startDate = _startDate;
        lessons = _lessons;
        level = _level;
    }

    static Course course_1 = new Course("AWTB_181210DN", "API_webservice_testing_level_1", "johny", "10-Dec-2018", 6,
            1);
    static Course course_2 = new Course("AWTA_181211", "API_webservice_testing_level_2", "mary", "11-Dec-2018", 10, 2);
    static Course course_3 = new Course("AWTA_200930", "Selenium_level_1", "victor", "30-Sep-2020", 8, 1);

    static Course[] courses = { course_1, course_2, course_3 };

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter the level to filter: ");
        displayCourse(levelFilter(myInput.nextInt()));
        System.out.print("Enter the instructor to filter: ");
        displayCourse(instructorFilter(myInput.next()));
        System.out.print("Enter the level and lesson to filter: ");
        displayCourse(levelAndLessonFilter(myInput.nextInt(), myInput.nextInt()));
        System.out.print("Enter the course keyword to filter: ");
        displayCourse(courseKeywordFilter(myInput.next()));
    }

    public static Object[] levelFilter(int level) {
        return Arrays.stream(courses).filter(s -> s.level == level).toArray();
    }

    public static Object[] instructorFilter(String instructor) {
        return Arrays.stream(courses).filter(s -> s.instructor.contains(instructor)).toArray();
    }

    public static Object[] levelAndLessonFilter(int level, int lessons) {
        return Arrays.stream(courses).filter(s -> s.level == level && s.lessons == lessons).toArray();
    }

    public static Object[] courseKeywordFilter(String courseName) {
        return Arrays.stream(courses).filter(s -> s.courseName.contains(courseName)).toArray();
    }

    public static void displayCourse(Object[] courseList) {
        for (int i = 0; i < courseList.length; i++) {
            Course course = (Course) courseList[i];
            System.out.println("-----------");
            System.out.println("Course Name: " + course.courseName);
            System.out.println("Course Instructor: " + course.instructor);
            System.out.println("Course Lessons: " + course.lessons);
            System.out.println("Course Level: " + course.level);
            System.out.println("-----------");
        }
    };
}
