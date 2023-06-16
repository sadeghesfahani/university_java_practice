package repositories;

import Entities.Student;
import base.BaseRepository;

public class StudentRepository extends BaseRepository<Student> {
    public StudentRepository() {
        super(Student.class);
    }

}