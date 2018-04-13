package nz.co.suveer.example.maven.testfactory.testfactorylogic.controller;

import nz.co.suveer.example.maven.testfactory.testfactorylogic.domain.Student;
import nz.co.suveer.example.maven.testfactory.testfactorylogic.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value="/students", method = RequestMethod.GET)
    public Iterable<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    @RequestMapping(value="students/id/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("id") int id){
        return studentRepository.findById(id);
    }
}
