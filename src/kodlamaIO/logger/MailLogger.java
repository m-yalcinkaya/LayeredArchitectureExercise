package kodlamaIO.logger;

import kodlamaIO.course.Course;

public class MailLogger implements Logger{

	@Override
	public void log(Course course) {
		System.out.println("Sent to mail : " + course.getCourseName());
		
	}

}
