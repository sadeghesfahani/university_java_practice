package Entities;

import base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class University extends BaseEntity {
    private String name;

    @OneToMany(mappedBy = "university")
    private Set<Student> students = new HashSet<>();
}