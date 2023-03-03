package kodlamaIO.dataAccess;

import kodlamaIO.course.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanina eklendi : " + course.getCourseName()  + " -- " + course.getInstructor());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Jdbc ile veritabanina silindi : " + course.getCourseName()  + " -- " + course.getInstructor());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Jdbc ile veritabanina guncellendi : " + course.getCourseName()  + " -- " + course.getInstructor());
	}

	
	
}
