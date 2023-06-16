package repositories;

import Entities.Course;
import base.BaseRepository;

public class CourseRepository extends BaseRepository<Course> {
    public CourseRepository() {
        super(Course.class);
    }

}