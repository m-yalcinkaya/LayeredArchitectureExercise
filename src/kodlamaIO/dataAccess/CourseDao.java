package kodlamaIO.dataAccess;

import kodlamaIO.course.Course;

public interface CourseDao {
	
	void add(Course course);
	void delete(Course course);
	void update(Course course);

}
