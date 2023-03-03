package kodlamaIO.dataAccess;

import kodlamaIO.course.Course;

public class HibernateCourseDao implements CourseDao{
	
	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanina eklendi : " + course.getCourseName()  + " -- " + course.getInstructor());
		
	}
	
	
	@Override
	public void update(Course course) {
		System.out.println("Hibernate ile veritabanina guncellendi : " + course.getCourseName()  + " -- " + course.getInstructor());
		
	}
	
	
	@Override
	public void delete(Course course) {
		System.out.println("Hibernate ile veritabanina silindi : " + course.getCourseName()  + " -- " + course.getInstructor());
		
	}
	

}
