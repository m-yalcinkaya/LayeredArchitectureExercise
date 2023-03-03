package kodlamaIO.dataAccess;

import kodlamaIO.course.Course;

public class HibernateCourseDao implements CourseDao{
	
	@Override
	public void add(Course course) {
		System.out.println("Added to database with hibernate : " + course.getCourseName()  + " -- " + course.getInstructor());
		
	}
	
	
	@Override
	public void update(Course course) {
		System.out.println("Updated to database with hibernate : " + course.getCourseName()  + " -- " + course.getInstructor());
		
	}
	
	
	@Override
	public void delete(Course course) {
		System.out.println("Deleted from database with hibernate : " + course.getCourseName()  + " -- " + course.getInstructor());
		
	}
	

}
