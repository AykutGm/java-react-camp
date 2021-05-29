package d2hm1;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "C#+ANGULAR Kamp�", "2 ay s�recek yaz�l�m geli�tirici yeti�tirme kamp�",
				"Engin Demiro�");
		Course course2 = new Course(2, "JAVA+REACT Kamp�", "2 ay s�recek yaz�l�m geli�tirici yeti�tirme kamp�",
				"Engin Demiro�");

		Course[] courses = { course1, course2 };
		for (Course course : courses) {
			System.out.println(course.courseName + " / " + course.courseDetail + " / " + course.courseInstructor);
		}
		System.out.println("----------------------------------------------------------");

		CourseManager courseManager = new CourseManager();

		courseManager.add(course1);
		courseManager.delete(course2);
	}
}