package kodlamaIO.logger;

import kodlamaIO.course.Course;

public class FileLogger implements Logger{

	@Override
	public void log(Course course) {
		System.out.println("Dosyaya loglandi : " + course.getCourseName());
		
	}

}
