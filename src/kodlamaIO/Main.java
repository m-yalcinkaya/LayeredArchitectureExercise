package kodlamaIO;

import kodlamaIO.business.CourseManager;
import kodlamaIO.course.Course;
import kodlamaIO.dataAccess.HibernateCourseDao;
import kodlamaIO.dataAccess.JpaCourseDao;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Course course1 = new Course();
		course1.setCategoryName("Egitim");
		course1.setCourseName("Java");
		course1.setCoursePrice(500);
		course1.setInstructor("Mustafa Yalcinkaya");
		
		Course course2 = new Course();
		course2.setCategoryName("Egitim1");
		course2.setCourseName("C#");
		course2.setCoursePrice(500);
		course2.setInstructor("Ahmet Guzel");
		
		Course course3 = new Course();
		course3.setCategoryName("Egitim2");
		course3.setCourseName("Javascript");
		course3.setCoursePrice(500);
		course3.setInstructor("Selin Yoruk");
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao());
		courseManager.add(course1);
		courseManager.delete(course1);
		courseManager.update(course1);
		
		
		
		

	}

}
