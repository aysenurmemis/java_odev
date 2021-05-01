package ödev1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 =  new  Course ( 1 , " C # + ANGULAR " );
		Course course2 =  new  Course ( 2 , " JAVA + REACT " );
		
		Course [] courses = {course1, course2};
		
		for ( Course course : courses) {
			System.out.println ( " Eðitimi olan kurslarýn isimleri: "  + course.courseName);
		}
		
		Instructor instructor =  new  Instructor ();
		instructor . name =  " Engin Demirog " ;
		instructor . lesson =  3 ;
		
			System.out.println ( " Eðitmen veren Kursu: "  + instructor . name);
			
			CourseManager courseManager =  new  CourseManager ();
			courseManager . addToCourse (course1);
			courseManager . addToCourse (course2);
			courseManager . deleteToCourse (course2);

	}

}
