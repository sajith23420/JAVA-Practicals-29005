public class TestPerson {
    public static void main(String[] args) {
  
        Student student = new Student();
        student.setName("John Doe");
        student.setId(1001);
        student.setCourse("Computer Science");

        Lecturer lecturer = new Lecturer();
        lecturer.setName("Jane Smith");
        lecturer.setId(2001);
        lecturer.setProgramme("Data Science");

       System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Course: " + student.getCourse());

        System.out.println("\nLecturer Name: " + lecturer.getName());
        System.out.println("Lecturer ID: " + lecturer.getId());
        System.out.println("Lecturer Programme: " + lecturer.getProgramme());
    }
}
