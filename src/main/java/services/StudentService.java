package services;

import Entities.Course;
import Entities.Student;
import Entities.University;
import repositories.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student registerStudent(String name, University university) {
        Student student = new Student();
        student.setName(name);
        student.setUniversity(university);

        return studentRepository.save(student);
    }

    public Student enrollCourse(Student student, Course course) {
        student.getCourses().add(course);
        course.getStudents().add(student);

        return studentRepository.save(student);
    }
}
