package nz.co.suveer.example.maven.testfactory.testfactorylogic.domain;
import javax.persistence.*;

@Entity
@Table(name="Student")
public class Student {

    @Id
    @Column(unique = true)
    private int id;
    @Column
    private String name;
    @Column
    private String passportNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
