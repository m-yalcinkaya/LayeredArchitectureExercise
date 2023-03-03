package kodlamaIO.dataAccess;

import kodlamaIO.course.Course;

public class JpaCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jpa ile veritabanina eklendi : " + course.getCourseName()  + " -- " + course.getInstructor());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Jpa ile veritabanından silindi : " + course.getCourseName()  + " -- " + course.getInstructor());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Jpa ile veritabanina guncellendi : " + course.getCourseName()  + " -- " + course.getInstructor());
		
	}

}
