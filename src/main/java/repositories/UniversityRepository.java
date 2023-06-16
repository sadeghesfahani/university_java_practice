package repositories;

import Entities.University;
import base.BaseRepository;

public class UniversityRepository extends BaseRepository<University> {
    public UniversityRepository() {
        super(University.class);
    }

}