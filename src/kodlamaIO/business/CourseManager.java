package kodlamaIO.business;



import java.util.ArrayList;
import java.util.List;

import kodlamaIO.course.Course;
import kodlamaIO.dataAccess.CourseDao;

public class CourseManager {

	private CourseDao courseDao;
	List<String> courseNames = new ArrayList<String>();
	List<String> categoryNames = new ArrayList<String>();
	
	
	
	public CourseManager(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	
	public void add(Course course) throws Exception {
		
		if(course.getCoursePrice() < 0) {
			throw new Exception("Bir kursun fiyati 0 tl'den kucuk olamaz.");
		}
		
		
			for (String category : categoryNames) {
				if(category == course.getCategoryName()) {
					throw new Exception("Bu isimde bir kategori zaten var !!");
				}
			}
		
			for (String courseName : courseNames) {
				if(courseName == course.getCourseName()) {
					throw new Exception("Bu isimde bir kurs ismi zaten var !!");
				}
			}	
		
		
		categoryNames.add(course.getCategoryName());
		courseNames.add(course.getCourseName());
		courseDao.add(course);
	}
	
	public void delete(Course course) {
		courseDao.delete(course);
	}
	
	public void update(Course course) {
		courseDao.update(course);
	}
}
