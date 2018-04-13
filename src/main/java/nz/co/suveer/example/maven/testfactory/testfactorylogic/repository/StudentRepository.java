package nz.co.suveer.example.maven.testfactory.testfactorylogic.repository;

import nz.co.suveer.example.maven.testfactory.testfactorylogic.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
    Student findById(int id);
}
