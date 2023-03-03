package kodlamaIO.logger;

import kodlamaIO.course.Course;

public class DatabaseLogger implements Logger{

	@Override
	public void log(Course course) {
		System.out.println("Veritabanina loglandi : " + course.getCourseName());
		
	}

}
